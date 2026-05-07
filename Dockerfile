# syntax = docker/dockerfile:1.2

ARG SWIFT_VERSION=5.10
ARG SWIFT_PROTOBUF_VERSION=1.34.1
ARG SWIFT_GRPC_VERSION=1.26.1
ARG NODE_VERSION=23
ARG GOLANG_VERSION=1.26
ARG GRPC_JAVA_VERSION=1.81.0
ARG GRPC_KOTLIN_VERSION=1.5.0

FROM swift:$SWIFT_VERSION AS swift-builder
ARG SWIFT_PROTOBUF_VERSION
ARG SWIFT_GRPC_VERSION

RUN mkdir /out && \
    git clone --branch $SWIFT_PROTOBUF_VERSION https://github.com/apple/swift-protobuf.git \
    && cd swift-protobuf \
    && swift build -c release \
    && cp .build/release/protoc-gen-swift /out/ && \
    cd .. && \
    git clone --branch $SWIFT_GRPC_VERSION https://github.com/grpc/grpc-swift.git && \
    cd grpc-swift && \
    swift build -c release && \
    cp .build/release/protoc-gen-grpc-swift /out/

FROM node:$NODE_VERSION-bookworm AS node
FROM golang:$GOLANG_VERSION-bookworm AS golang
FROM debian:bookworm AS builder
ARG GRPC_JAVA_VERSION
ARG GRPC_KOTLIN_VERSION

COPY --from=node /usr/local /usr/local
COPY --from=golang /usr/local/go /usr/local/go
COPY --from=golang /etc/ssl/certs/ca-certificates.crt /etc/ssl/certs/ca-certificates.crt
COPY --from=swift-builder /out/* /usr/local/bin/
COPY --from=swift-builder /usr/lib/swift/linux /usr/lib/swift/linux

RUN echo "/usr/lib/swift/linux" >> /etc/ld.so.conf.d/swift.conf && ldconfig

RUN apt-get update && apt-get install -y --no-install-recommends \
    make bash protobuf-compiler grep parallel default-jre wget \
    && rm -rf /var/lib/apt/lists/* \
    && mkdir -p ~/.parallel && touch ~/.parallel/will-cite

RUN ARCH=$(uname -m | sed 's/aarch64/aarch_64/') && \
    wget -O /usr/local/bin/protoc-gen-grpc-java \
    https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/${GRPC_JAVA_VERSION}/protoc-gen-grpc-java-${GRPC_JAVA_VERSION}-linux-${ARCH}.exe \
    && chmod +x /usr/local/bin/protoc-gen-grpc-java

RUN wget -O /usr/local/lib/protoc-gen-grpc-kotlin.jar \
    https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-kotlin/${GRPC_KOTLIN_VERSION}/protoc-gen-grpc-kotlin-${GRPC_KOTLIN_VERSION}-jdk8.jar \
    && echo '#!/bin/sh\nexec java -jar /usr/local/lib/protoc-gen-grpc-kotlin.jar "$@"' \
    > /usr/local/bin/protoc-gen-grpc-kotlin \
    && chmod +x /usr/local/bin/protoc-gen-grpc-kotlin

ENV PATH=/usr/local/go/bin:/root/go/bin:/usr/local/bin:$PATH

WORKDIR /pb
COPY package.json .
COPY Makefile .

RUN make init

COPY . .

RUN make gen2

FROM scratch AS export
COPY --from=builder /pb/out /out
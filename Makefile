OS=
ifeq ($(shell uname -s),Linux)
	export OS=LINUX
endif
ifeq ($(shell uname -s),Darwin)
	export OS=MACOS
endif
ifeq ($(findstring microsoft,$(shell uname -a)),microsoft)
	export OS=WINDOWS
endif

export TITLE = "\033[32m[%s]\033[0m %s\n"
export ERROR = "\033[31m[%s]\033[0m %s\n"

export PROTOC_GEN_GO_VER=1.30.0
export PROTOC_GEN_WEB_VER=1.3.1
export PROTOC_GEN_KOTLIN_VER=1.4.1
export PROTOC_GEN_JAVA_VER=1.54.1

ifeq ($(OS),MACOS)
init::
	chmod +x init.sh && ./init.sh && rm -r bin && \
	mkdir -p bin && \
	cd bin && \
	rm -f protoc-gen-go && rm -f protoc-gen-grpc-kotlin* && rm -f protoc-gen-grpc-java* && \
	wget https://github.com/protocolbuffers/protobuf-go/releases/download/v${PROTOC_GEN_GO_VER}/protoc-gen-go.v${PROTOC_GEN_GO_VER}.darwin.amd64.tar.gz && \
	tar -xf protoc-gen-go.v${PROTOC_GEN_GO_VER}.darwin.amd64.tar.gz && \
	rm protoc-gen-go.v${PROTOC_GEN_GO_VER}.darwin.amd64.tar.gz && \
	chmod +x protoc-gen-go && \
	wget https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-kotlin/${PROTOC_GEN_KOTLIN_VER}/protoc-gen-grpc-kotlin-${PROTOC_GEN_KOTLIN_VER}-jdk8.jar && \
	mv protoc-gen-grpc-kotlin-${PROTOC_GEN_KOTLIN_VER}-jdk8.jar protoc-gen-grpc-kotlin-jdk8.jar && \
	echo '#!/usr/bin/env sh\n\nDIR="$$( cd "$$( dirname "$${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"\njava -jar $$DIR/protoc-gen-grpc-kotlin-jdk8.jar $$@' > ../bin/protoc-gen-grpc-kotlin.sh && chmod +x protoc-gen-grpc-kotlin.sh && \
	wget https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/${PROTOC_GEN_JAVA_VER}/protoc-gen-grpc-java-${PROTOC_GEN_JAVA_VER}-osx-x86_64.exe && \
	mv protoc-gen-grpc-java-${PROTOC_GEN_JAVA_VER}-osx-x86_64.exe protoc-gen-grpc-java && \
	chmod +x protoc-gen-grpc-java && \
	npm i
else
init::
	mkdir -p bin && \
	cd bin && \
	rm -f protoc-gen-go && rm -f protoc-gen-grpc-kotlin* && rm -f protoc-gen-grpc-java* && \
	wget https://github.com/protocolbuffers/protobuf-go/releases/download/v${PROTOC_GEN_GO_VER}/protoc-gen-go.v${PROTOC_GEN_GO_VER}.linux.amd64.tar.gz && \
	tar -xf protoc-gen-go.v${PROTOC_GEN_GO_VER}.linux.amd64.tar.gz && \
	rm protoc-gen-go.v${PROTOC_GEN_GO_VER}.linux.amd64.tar.gz && \
	chmod +x protoc-gen-go && \
	wget https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-kotlin/${PROTOC_GEN_KOTLIN_VER}/protoc-gen-grpc-kotlin-${PROTOC_GEN_KOTLIN_VER}-jdk8.jar && \
	mv protoc-gen-grpc-kotlin-${PROTOC_GEN_KOTLIN_VER}-jdk8.jar protoc-gen-grpc-kotlin-jdk8.jar && \
	echo '#!/bin/bash\n\nDIR="$$( cd "$$( dirname "$${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"\njava -jar $$DIR/protoc-gen-grpc-kotlin-jdk8.jar $$@' > ../bin/protoc-gen-grpc-kotlin.sh && chmod +x protoc-gen-grpc-kotlin.sh && \
	wget https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/${PROTOC_GEN_JAVA_VER}/protoc-gen-grpc-java-${PROTOC_GEN_JAVA_VER}-linux-x86_64.exe && \
	mv protoc-gen-grpc-java-${PROTOC_GEN_JAVA_VER}-linux-x86_64.exe protoc-gen-grpc-java && \
	chmod +x protoc-gen-grpc-java && \
    npm i
endif

ifeq ($(OS),WINDOWS)
gen::
	@dos2unix --quiet generate.sh transform.sh
	@printf $(TITLE) "+" "Generating.."
	@./generate.sh
	@printf $(TITLE) "+" "Transforming.."
	@./transform.sh
	@printf $(TITLE) "+" "Done"
else ifeq ($(OS),MACOS)
gen::
	@printf $(TITLE) "+" "Generating.."
	@chmod +x generate.sh && ./generate.sh
	@printf $(TITLE) "+" "Transforming.."
	@chmod +x transform_mac.sh && ./transform_mac.sh
	@printf $(TITLE) "+" "Done"
else
gen::
	@printf $(TITLE) "+" "Generating.."
	@chmod +x generate.sh && ./generate.sh
	@printf $(TITLE) "+" "Transforming.."
	@chmod +x transform.sh && ./transform.sh
	@printf $(TITLE) "+" "Done"
endif

gen2:
	@dos2unix --quiet adapter.sh generate2.sh transform2.sh || true
	@printf $(TITLE) "+" "Generating.."
	@chmod +x generate2.sh && ./generate2.sh
	@printf $(TITLE) "+" "Transforming.."
	@chmod +x transform2.sh && ./transform2.sh
	@printf $(TITLE) "+" "Assembling.."
	@chmod +x assemble2.sh && ./assemble2.sh
	@printf $(TITLE) "+" "Done"
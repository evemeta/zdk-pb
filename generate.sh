#!/bin/bash
export PATH=$PATH:$GOPATH/bin:$(pwd)/bin

if [ "$(which "protoc-gen-go-grpc")" != "" ]; then
  rm -r out/go 2>/dev/null ; true && mkdir -p out/go
  protoc \
    --proto_path="./src" \
    --go_out="./out/go" \
    --go_opt=paths=source_relative \
    --go-grpc_out="./out/go" \
    --go-grpc_opt=paths=source_relative \
    --grpc-gateway_out out/go \
    --grpc-gateway_opt logtostderr=true \
    --grpc-gateway_opt paths=source_relative \
    --grpc-gateway_opt generate_unbound_methods=true \
    --experimental_allow_proto3_optional \
    $(find "./src" -name "*.proto")
fi

if [ "$(which "npx")" != "" ]; then
  rm -r out/ts 2>/dev/null ; true && mkdir -p out/ts
  npx protoc \
    --proto_path="./src" \
    --ts_out="./out/ts" \
    --experimental_allow_proto3_optional \
    $(find "./src" -name "*.proto" -not -regex ".*private.*")
fi

if [ "$(which "protoc-gen-grpc-java")" != "" ]; then
  rm -r out/java/src/main/java out/java/src/main/kotlin 2>/dev/null ; true && mkdir -p out/java/src/main/java out/java/src/main/kotlin
  protoc \
    --proto_path="./src" \
    --plugin=protoc-gen-grpc-kotlin=$(pwd)/bin/protoc-gen-grpc-kotlin.sh \
    --grpc-java_out="./out/java/src/main/java" \
    --grpc-kotlin_out="./out/java/src/main/kotlin" \
    --java_out="./out/java/src/main/java" \
    --kotlin_out="./out/java/src/main/kotlin" \
    --experimental_allow_proto3_optional \
    $(find "./src" -iname "*.proto" -not -regex ".*private.*")
fi

if [ "$(which "protoc-gen-swift")" != "" ] && [ "$(which "protoc-gen-grpc-swift")" != "" ]; then
  rm -r out/swift 2>/dev/null ; true && mkdir -p out/swift
  protoc \
    --proto_path="./src" \
    --swift_opt=FileNaming=PathToUnderscores \
    --grpc-swift_opt=Client=true,Server=false,FileNaming=PathToUnderscores \
    --swift_out="./out/swift" \
    --swift_opt=Visibility=Public \
    --grpc-swift_out="./out/swift" \
    --grpc-swift_opt=Visibility=Public \
    --experimental_allow_proto3_optional \
    $(find "./src" -iname "*.proto" -not -regex ".*private.*")
fi

# 0m30.211s
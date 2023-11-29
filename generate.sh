#!/bin/bash
export PATH=$PATH:$GOPATH/bin:$(pwd)/bin

rm -r out/go 2>/dev/null ; true
rm -r out/ts 2>/dev/null ; true
mkdir -p out/go out/ts

if [ "$(which "protoc-gen-grpc-java")" != "" ]; then
  mkdir -p out/java/lib/src/main/kotlin/ out/java/lib/src/main/java/
fi

protoc \
  --proto_path="./src" \
  --proto_path="./lib" \
  --go_out="./out/go" \
  --go_opt=paths=source_relative \
  --go-grpc_out="./out/go" \
  --go-grpc_opt=paths=source_relative \
  --grpc-gateway_out out/go \
  --grpc-gateway_opt logtostderr=true \
  --grpc-gateway_opt paths=source_relative \
  --grpc-gateway_opt generate_unbound_methods=true \
  --openapiv2_out doc --openapiv2_opt logtostderr=true \
  --experimental_allow_proto3_optional \
  $(find "./src" -name "*.proto")

npx protoc \
  --proto_path="./src" \
  --proto_path="./lib" \
  --ts_out="./out/ts" \
  --experimental_allow_proto3_optional \
  $(find "./src" -name "*.proto" -not -regex ".*private.*")

if [ "$(which "protoc-gen-grpc-java")" != "" ]; then
  protoc \
    --proto_path="./src" \
    --proto_path="./lib" \
    --plugin=protoc-gen-grpckt=$(pwd)/bin/protoc-gen-grpc-kotlin.sh \
    --plugin=protoc-gen-grpc-java=$(pwd)/bin/protoc-gen-grpc-java \
    --grpckt_out="./out/java/lib/src/main/kotlin" \
    --grpc-java_out="./out/java/lib/src/main/java" \
    --java_out="./out/java/lib/src/main/java" \
    --kotlin_out="./out/java/lib/src/main/kotlin" \
    --experimental_allow_proto3_optional \
    $(find "./src" -iname "*.proto" -not -regex ".*private.*")
fi

if [ "$(which "protoc-gen-swift")" != "" ] && [ "$(which "protoc-gen-grpc-swift")" != "" ]
then
  rm -rf out/swift
  mkdir -p out/swift
  protoc \
    --proto_path="./src" \
    --proto_path="./lib" \
    --swift_opt=FileNaming=PathToUnderscores \
    --grpc-swift_opt=Client=true,Server=false,FileNaming=PathToUnderscores \
    --swift_out="./out/swift" \
    --swift_opt=Visibility=Public \
    --grpc-swift_out="./out/swift" \
    --grpc-swift_opt=Visibility=Public \
    --experimental_allow_proto3_optional \
    $(find "./src" -iname "*.proto" -not -regex ".*private.*")
fi
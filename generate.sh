#!/bin/bash
export PATH=$PATH:$GOPATH/bin:$(pwd)/bin

rm -r out 2>/dev/null ; true
mkdir -p out/go out/ts
rm -rf out/java/lib/src
mkdir -p out/java/lib/src/main/kotlin/ out/java/lib/src/main/java/


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

if [ "$(which "protoc-gen-grpc-java")" != "" ]
    then
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
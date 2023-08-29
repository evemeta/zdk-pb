#!/bin/bash
export PATH=$PATH:$GOPATH/bin:$(pwd)/bin

rm -r out 2>/dev/null ; true
mkdir -p out/go out/ts

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
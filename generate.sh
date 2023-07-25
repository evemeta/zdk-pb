#!/bin/bash
export PATH=$PATH:$GOPATH/bin:$(pwd)/bin

PROTOBUF_GO_VERSION="v1.25.0"
generate() {
    rm -r out/go/"$1" out/ts/"$1"
    mkdir -p out/go/"$1" out/ts/"$1"

    printf "Generating proto for %s... " "$1"
    protoc -I src \
      --proto_path=src/"$1" \
      --proto_path=lib \
      --go_out=out/go \
      --go_opt=paths=source_relative \
      --go-grpc_out=out/go \
      --go-grpc_opt=paths=source_relative \
      $(find src/"$1" -iname "*.proto") \
      --grpc-gateway_out out/go \
      --grpc-gateway_opt logtostderr=true \
      --grpc-gateway_opt paths=source_relative \
      --grpc-gateway_opt generate_unbound_methods=true \
      --openapiv2_out doc --openapiv2_opt logtostderr=true \
      --experimental_allow_proto3_optional

    npx protoc -I=src -I=lib $(find src/"$1" -iname "*.proto" -not -regex ".*private.*") \
      --proto_path=src/"$1" \
      --ts_out=out/ts \
      --experimental_allow_proto3_optional

    printf "OK\n"
}

generate chat
generate gateway
generate user
generate websocket
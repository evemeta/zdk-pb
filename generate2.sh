#!/bin/bash

source adapter.sh

generate_go() {
    commands=("protoc" "protoc-gen-go" "protoc-gen-go-grpc" "protoc-gen-grpc-gateway" "protoc-gen-go-vtproto")
    for command in "${commands[@]}"; do
        if ! command -v "$command" &> /dev/null; then
            echo "$command is not available." >&2
            return 1
        fi
    done

    rm -r out/go 2>/dev/null ; true && mkdir -p out/go

    generate(){
      genType="${1:-"normal"}"
          arguments=(
              --proto_path="./src"
              --go_out="./out/go"
              --go_opt="paths=source_relative"
              --go-grpc_out="./out/go"
              --go-grpc_opt="paths=source_relative"
              --grpc-gateway_out="./out/go"
              --grpc-gateway_opt="logtostderr=true"
              --grpc-gateway_opt="paths=source_relative"
              --grpc-gateway_opt="generate_unbound_methods=true"
              --experimental_allow_proto3_optional
              $(cfind "./src" -iname "*.proto")
          )

          if [[ "$genType" == "mcu" ]]; then
              new_array=()
              for value in "${arguments[@]}"
              do
                  # shellcheck disable=SC2235
                  ([[ $value == *"/mcu/"* ]] || [[ $value == "--"* ]]) && new_array+=("$value")
              done
              arguments=("${new_array[@]}")
              arguments+=(
                --go-vtproto_out="./out/go"
                --plugin protoc-gen-go-vtproto="${GOPATH}/bin/protoc-gen-go-vtproto"
                --go-vtproto_opt=paths=source_relative
                --go-vtproto_opt=features=marshal+unmarshal+size+pool
                --go-vtproto_opt=pool=gitlab.com/evemeta/zdk/pb/out/go/mcu/private/v1.InputPacket
                --go-vtproto_opt=pool=gitlab.com/evemeta/zdk/pb/out/go/mcu/private/v1.OutputPacket
                --go-vtproto_opt=pool=gitlab.com/evemeta/zdk/pb/out/go/mcu/private/v1.RTPPacket
                --go-vtproto_opt=pool=gitlab.com/evemeta/zdk/pb/out/go/mcu/private/v1.Sample
              )
          else
              new_array=()
              for value in "${arguments[@]}"
              do
                  [[ $value != *"/mcu/"* ]] && new_array+=("$value")
              done
              arguments=("${new_array[@]}")
          fi

          if protoc "${arguments[@]}"; then
              echo "go files generated successfully."
          else
              echo "go generation process failed." >&2
              return 1
          fi
    }

    generate normal & generate mcu

}

generate_ts() {

    commands=("npx")
    for command in "${commands[@]}"; do
        if ! command -v "$command" &> /dev/null; then
            echo "$command is not available." >&2
            return 1
        fi
    done

    rm -r out/ts 2>/dev/null ; true && mkdir -p out/ts

    arguments=(
        --proto_path="./src"
        --ts_out="./out/ts"
        --experimental_allow_proto3_optional
        $(cfind "./src" -name "*.proto" -not -regex ".*private.*")
    )

    if npx protoc "${arguments[@]}"; then
        echo "ts files generated successfully."
    else
        echo "ts generation process failed." >&2
        return 1
    fi
}

generate_java() {

    commands=("protoc" "protoc-gen-grpc-java")
    for command in "${commands[@]}"; do
        if ! command -v "$command" &> /dev/null; then
            echo "$command is not available." >&2
            return 1
        fi
    done

    rm -r out/java/src/main/java 2>/dev/null ; true && mkdir -p out/java/src/main/java

    arguments=(
        --proto_path="./src"
        --java_out="./out/java/src/main/java"
        --grpc-java_out="./out/java/src/main/java"
        --experimental_allow_proto3_optional
        $(cfind "./src" -iname "*.proto" -not -regex ".*private.*")
    )

    if protoc "${arguments[@]}"; then
        echo "java files generated successfully."
    else
        echo "java generation process failed." >&2
        return 1
    fi
}

generate_swift() {

    commands=("protoc" "protoc-gen-swift" "protoc-gen-grpc-swift")
    for command in "${commands[@]}"; do
        if ! command -v "$command" &> /dev/null; then
            echo "$command is not available." >&2
            return 1
        fi
    done

    rm -r out/swift 2>/dev/null ; true && mkdir -p out/swift

    arguments=(
        --proto_path="./src"
        --swift_opt="FileNaming=PathToUnderscores,Visibility=Public"
        --grpc-swift_opt="Client=true,Server=false,FileNaming=PathToUnderscores,Visibility=Public"
        --swift_out="./out/swift"
        --grpc-swift_out="./out/swift"
        --experimental_allow_proto3_optional
        $(cfind "./src" -iname "*.proto" -not -regex ".*private.*")
    )

    if protoc "${arguments[@]}"; then
        echo "swift files generated successfully."
    else
        echo "swift generation process failed." >&2
        return 1
    fi
}

generate_kotlin() {

    commands=("protoc" "protoc-gen-grpc-kotlin.sh")
    for command in "${commands[@]}"; do
        if ! command -v "$command" &> /dev/null; then
            echo "$command is not available." >&2
            return 1
        fi
    done

    rm -r out/java/src/main/kotlin 2>/dev/null ; true && mkdir -p out/java/src/main/kotlin

    arguments=(
        --proto_path="./src"
        --plugin=protoc-gen-grpc-kotlin=$(pwd)/bin/protoc-gen-grpc-kotlin.sh
        --kotlin_out="./out/java/src/main/kotlin"
        --grpc-kotlin_out="./out/java/src/main/kotlin"
        --experimental_allow_proto3_optional
        $(cfind "./src" -iname "*.proto" -not -regex ".*private.*")
    )

    if protoc "${arguments[@]}"; then
        echo "kotlin files generated successfully."
    else
        echo "kotlin generation process failed." >&2
        return 1
    fi
}

trap 'kill $(jobs -p)' SIGINT

generate_go & generate_ts & generate_java & generate_swift & generate_kotlin & wait
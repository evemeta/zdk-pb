#!/bin/bash

source adapter.sh

transform_go() {

    local files;

    files=$(cfind "out/go" -type f -name "*.go")

    if [ -z "$files" ]; then exit 1; fi

    local enums;

    enums=$(cgrep -rohP "type \K[a-zA-Z0-9_]+(?= int32)" "out/go" | sort -u | tr '\n' ' ')

    if [ -z "$enums" ]; then exit 1; fi

    transform_go_file() {
        local file="$1"
        local names; IFS=" " read -r -a names <<< "$2"
        local patterns=()

        for name in "${names[@]}"; do
            patterns+=("-e" "s/\b${name}_${name}/${name}/g")
        done

        csed -i "${patterns[@]}" "$file"
    }

    export -f transform_go_file

    parallel transform_go_file ::: "${files[@]}" ::: "$enums"

    echo "go files transformed successfully."
}

transform_ts() {

    local files;

    files=$(cfind "out/ts" -type f -name "*.ts")

    if [ -z "$files" ]; then exit 1; fi

    local enums;

    enums=$(cgrep -rohP "export enum \K[a-zA-Z0-9_]+" "out/ts" | sort -u | tr '\n' ' ')

    if [ -z "$enums" ]; then exit 1; fi

    transform_ts_file() {
        local file="$1"
        local names; IFS=" " read -r -a names <<< "$2"
        local patterns=()

        for name in "${names[@]}"; do
            patterns+=("-e" "s/\b${name}\([A-Z]\)/\1/g")
        done

        csed -i "${patterns[@]}" "$file"
    }

    export -f transform_ts_file

    parallel transform_ts_file ::: "${files[@]}" ::: "$enums"

    echo "ts files transformed successfully."
}

transform_java() {

#    local files;
#
#    files=$(cfind "out/java/src/main/java" -type f -name "*.java")
#
#    if [ -z "$files" ]; then exit 1; fi
#
#    local enums;
#
#    enums=$(cgrep -rohP "^\s*(public\s+)?enum \K[a-zA-Z0-9_]+" "out/java/src/main/java" | sort -u | tr '\n' ' ')
#
#    if [ -z "$enums" ]; then exit 1; fi
#
#    transform_java_file() {
#        local file="$1"
#        local names; IFS=" " read -r -a names <<< "$2"
#        local patterns=()
#
#        for name in "${names[@]}"; do
#            patterns+=("-e" "s/(${name}\.)${name}([[:alnum:]_]+)/\1\2/g")
#            patterns+=("-e" "s/^${name}([[:alnum:]_])/\1/")
#            patterns+=("-e" "s/(\s|<code>)${name}([[:alnum:]_])/\1\2/g")
#        done
#
#        csed -i -E "${patterns[@]}" "$file"
#    }
#
#    export -f transform_java_file
#
#    parallel transform_java_file ::: "${files[@]}" ::: "$enums"

    echo "java files transformed successfully."
}

trap 'kill $(jobs -p)' SIGINT

transform_go & transform_ts & transform_java & wait

# todo; java enums and specifically ProtocolVersion is broken after transformations
#!/bin/bash

source adapter.sh

assemble_java() {

    rm out/java/src/main/kotlin/com/evemeta/zdk/pb/Registry.kt 2>/dev/null ; true

    local files;

    files=($(cgrep -rl "\scom\.google\.protobuf\.GeneratedMessage\s" "out/java/src/main/java"))

    if [ -z "$files" ]; then exit 1; fi

    assemble_java_file() {
        local file="$1"
        local package_name=$(cgrep -oP '^package\s+\K[\w.]+(?=;)' "$file")
        local class_name=$(cgrep -oP 'public\s+(final\s+)?class\s+\K\w+' "$file")

        if [[ -n "$package_name" && -n "$class_name" ]]; then
            echo "        registerMessage($package_name.$class_name::class)"
        fi
    }

    export -f assemble_java_file

    local content=$(parallel assemble_java_file {} ::: "${files[@]}")

        read -r -d '' final_content <<EOF
package com.evemeta.zdk.pb

object Registry {

    private val parsers: MutableMap<String, com.google.protobuf.Parser<out com.google.protobuf.Message>> = mutableMapOf()

    private val builders: MutableMap<String, com.google.protobuf.Message.Builder> = mutableMapOf()

    init {
$content
    }

    private fun <T : com.google.protobuf.Message> registerMessage(message: kotlin.reflect.KClass<T>) {

        val name = (message.java.getMethod("getDescriptor").invoke(null) as com.google.protobuf.Descriptors.Descriptor).fullName

        val parser = message.java.getMethod("parser").invoke(null) as com.google.protobuf.Parser<out com.google.protobuf.Message>

        val builder = message.java.getMethod("newBuilder").invoke(null) as com.google.protobuf.Message.Builder

        parsers[name] = parser

        builders[name] = builder
    }

    fun parseFrom(name: String, data: String): com.google.protobuf.Message? {
        return builders[name]?.clone()?.run {
            com.google.protobuf.util.JsonFormat.parser().merge(data, this)
            build()
        }
    }

    fun parseFrom(name: String, data: ByteArray): com.google.protobuf.Message? {
        return parsers[name]?.parseFrom(data)
    }

    fun parseFrom(name: String, data: java.nio.ByteBuffer): com.google.protobuf.Message? {
        return parsers[name]?.parseFrom(data)
    }

    fun parseFrom(name: String, data: com.google.protobuf.ByteString): com.google.protobuf.Message? {
        return parsers[name]?.parseFrom(data)
    }

    fun parseFrom(name: String, input: java.io.InputStream): com.google.protobuf.Message? {
        return parsers[name]?.parseFrom(input)
    }

    fun parseFrom(name: String, input: com.google.protobuf.CodedInputStream): com.google.protobuf.Message? {
        return parsers[name]?.parseFrom(input)
    }

    fun parsePartialFrom(name: String, data: ByteArray): com.google.protobuf.Message? {
        return parsers[name]?.parsePartialFrom(data)
    }

    fun parsePartialFrom(name: String, data: com.google.protobuf.ByteString): com.google.protobuf.Message? {
        return parsers[name]?.parsePartialFrom(data)
    }

    fun parsePartialFrom(name: String, input: java.io.InputStream): com.google.protobuf.Message? {
        return parsers[name]?.parsePartialFrom(input)
    }

    fun parsePartialFrom(name: String, input: com.google.protobuf.CodedInputStream): com.google.protobuf.Message? {
        return parsers[name]?.parsePartialFrom(input)
    }
}
EOF

    echo -e "$final_content" > "out/java/src/main/kotlin/com/evemeta/zdk/pb/Registry.kt"

    echo "java files assembled successfully."
}

trap 'kill $(jobs -p)' SIGINT

assemble_java & wait
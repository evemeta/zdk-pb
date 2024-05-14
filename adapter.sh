#!/bin/bash

export PATH=$PATH:$GOPATH/bin:$(pwd)/bin

csed() {
    if [[ "$(uname -s)" == "Linux" ]]; then
        sed "$@"
    else
        if command -v "gsed" &> /dev/null; then
            gsed "$@"
        else
            echo "gsed is not available." >&2
            return 1
        fi
    fi
}

export -f csed

cfind() {
    if [[ "$(uname -s)" == "Linux" ]]; then
        find "$@"
    else
        if command -v "gfind" &> /dev/null; then
            gfind "$@"
        else
            echo "gfind is not available." >&2
            return 1
        fi
    fi
}

export -f cfind

cgrep() {
    if [[ "$(uname -s)" == "Linux" ]]; then
        grep "$@"
    else
        if command -v "ggrep" &> /dev/null; then
            ggrep "$@"
        else
            echo "ggrep is not available." >&2
            exit 1
        fi
    fi
}

export -f cgrep
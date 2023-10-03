#!/bin/zsh

IFS=$'\n' read -r -d '' -A go_names < <(ggrep -rohP 'type \K[a-zA-Z0-9_]+(?= int32)' "out/go" | sort -u)
for name in "${go_names[@]}"; do
    if [[ "$name" == '' ]]; then
      continue
    fi
    escaped=$(echo "$name" | gsed 's/[^a-zA-Z0-9_]/\\&/g')
    gfind "out/go" -type f | gxargs gsed -i'' -e "s/\b${escaped}_${escaped}/$escaped/g"
done

IFS=$'\n' read -r -d '' -A ts_names < <(ggrep -rohP 'export enum \K[a-zA-Z0-9_]+' "out/ts" | sort -u)
for name in "${ts_names[@]}"; do
    if [[ "$name" == '' ]]; then
      continue
    fi
    escaped=$(echo "$name" | gsed 's/[^a-zA-Z0-9_]/\\&/g')
    gfind "out/ts" -type f | gxargs gsed -i'' -e "s/\b${escaped}\([A-Z]\)/\1/g"
done
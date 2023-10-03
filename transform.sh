#!/bin/bash

mapfile -t go_names < <(grep -rohP 'type \K[a-zA-Z0-9_]+(?= int32)' "out/go" | sort -u)
for name in "${go_names[@]}"; do
    escaped=$(echo "$name" | sed 's/[^a-zA-Z0-9_]/\\&/g')
    find "out/go" -type f | xargs sed -i'' -e "s/\b${escaped}_${escaped}/$escaped/g"
done

mapfile -t ts_names < <(grep -rohP 'export enum \K[a-zA-Z0-9_]+' "out/ts" | sort -u)
for name in "${ts_names[@]}"; do
    escaped=$(echo "$name" | sed 's/[^a-zA-Z0-9_]/\\&/g')
    find "out/ts" -type f | xargs sed -i'' -e "s/\b${escaped}\([A-Z]\)/\1/g"
done
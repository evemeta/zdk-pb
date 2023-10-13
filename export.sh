#!/bin/bash

dir=$1

temp_funcs=$(mktemp)
temp_types=$(mktemp)
temp_consts=$(mktemp)

trap 'rm -f "$temp_funcs" "$temp_types" "$temp_consts"' EXIT

find "$dir" -type f | while IFS= read -r file; do
    package=$(awk -F' ' '/package/{print $2; exit}' "$file")
    awk -v pkg="$package" -v temp_funcs="$temp_funcs" '
        /^type [A-Z]/ {
            print "    " $2 " = " pkg "." $2 >> "'"$temp_types"'";
            if ($2 ~ /Mutation$/) {
                mutation = $2; gsub("Mutation$", "Argument", mutation);
                print "func New" $2 "(foundation *" mutation ") *" $2 " {\n    return &" $2 " {\n        Foundation: foundation,\n    }\n}\n" >> temp_funcs;
            }
        }
        /^const[[:space:]]*\(/,/\)/ { if ($1 ~ /^[A-Z]/) print "    " $1 " = " pkg "." $1 >> "'"$temp_consts"'"; }
    ' "$file"
done

cat "$temp_funcs"
echo -e "type (\n$(cat "$temp_types")\n)";
echo -e "const (\n$(cat "$temp_consts")\n)";
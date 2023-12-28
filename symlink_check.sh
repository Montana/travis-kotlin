#!/usr/bin/env bash

grep -R -e '^\.\./\.\.' pubsub | cut -d: -f1 - | while IFS= read -r file
do
    dir=$(dirname "$file")
    filename=$(basename "$file")
    target=$(cat "$file")

    echo "Replacing ${file} with symlink to ${target}."

    pushd "$dir" || continue
    rm -f "$filename"
    ln -s "$target" "$filename"
    popd || continue

    unset dir filename
done

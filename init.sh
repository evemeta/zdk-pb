#!/bin/bash

if [[ $OSTYPE == 'darwin'* ]]; then
  if [ "$(which "brew")" == "" ]; then
          echo -e "\033[0;31mbrew instalation is required!\033[0m"
          echo -e "Install from https://brew.sh/"
          exit 42
  fi
  if [ "$(which "ggrep")" == "" ]; then
    brew install grep
  fi
  if [ "$(which "gsed")" == "" ]; then
    brew install gnu-sed
  fi
  if [ "$(which "gfind")" == "" ]; then
    brew install findutils
  fi
fi

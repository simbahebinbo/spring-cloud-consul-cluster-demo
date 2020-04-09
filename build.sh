#!/usr/bin/env bash

CurrentDir=$(dirname $0)

find ${CurrentDir} -name "build" | xargs rm -rf
find ${CurrentDir} -name "out" | xargs rm -rf

gradle wrapper
${CurrentDir}/gradlew clean build

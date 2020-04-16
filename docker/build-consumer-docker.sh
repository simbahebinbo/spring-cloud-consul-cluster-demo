#!/bin/bash

# 构建docker镜像
APP_NAME=service-consumer

docker build --build-arg APPLICATION_NAME=${APP_NAME} -t ${APP_NAME} .

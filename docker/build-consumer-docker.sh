#!/bin/bash

# 构建docker镜像
APPLICATION_NAME=service-consumer

docker build --build-arg APPLICATION_NAME=${APPLICATION_NAME} -t ${APPLICATION_NAME} .

#!/bin/bash

# 构建docker镜像
APP_NAME=service-consumer

docker build -t ${APP_NAME} .

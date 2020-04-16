#!/bin/bash

# 构建docker镜像

APP_NAME=service-producer
CONSUL_SERVERS=172.18.18.141:8500,172.18.18.142:8500,172.18.18.143:8500,172.18.18.144:8500,172.18.18.145:8500,172.18.18.146:8500

docker build --build-arg APPLICATION_NAME=${APP_NAME} CONSUL_NODES=${CONSUL_SERVERS} -t ${APP_NAME} .

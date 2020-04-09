#!/bin/bash

#启动docker
APP_NAME=service-consumer

docker run --net=host ${APP_NAME} -e "APPLICATION_NAME=${APP_NAME}"

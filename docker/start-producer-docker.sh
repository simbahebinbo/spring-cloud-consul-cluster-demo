#!/bin/bash

#启动docker

APP_NAME=service-producer

docker run --net=host ${APP_NAME} -e "APP_NAME=${APP_NAME}"

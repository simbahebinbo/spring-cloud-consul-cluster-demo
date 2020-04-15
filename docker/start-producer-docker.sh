#!/bin/bash

#启动docker

APPLICATION_NAME=service-producer

docker run -d --net=host ${APPLICATION_NAME}

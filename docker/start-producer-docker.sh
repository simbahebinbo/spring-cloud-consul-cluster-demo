#!/bin/bash

#启动docker

APPLICATION_NAME=service-producer

docker run --net=host ${APPLICATION_NAME}

#!/bin/bash

#启动docker
APPLICATION_NAME=service-consumer

docker run -d --net=host ${APPLICATION_NAME}

#!/bin/bash

#启动docker
APPLICATION_NAME=service-consumer

docker run --net=host ${APPLICATION_NAME}

#!/usr/bin/env bash

#测试 service-consumer 是否正常启动

BaseUrl="http://172.18.18.141:9901"

curl -X GET  -H "Content-Type:application/json" $BaseUrl"/service-consumer/hi?name=php"



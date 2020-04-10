#!/usr/bin/env bash

#测试 service-producer 是否正常启动
BaseUrl="http://172.18.18.141:9900"

curl -X GET  -H "Content-Type:application/json" $BaseUrl"/service-producer/hello"

curl -X GET  -H "Content-Type:application/json" $BaseUrl"/service-producer/get-hi"

curl -X POST  -H "Content-Type:application/json" $BaseUrl"/service-producer/post-hi"

curl -X GET  -H "Content-Type:application/json" $BaseUrl"/service-producer/user/description"
curl -X GET  -H "Content-Type:application/json" $BaseUrl"/service-producer/user/author"
curl -X GET  -H "Content-Type:application/json" $BaseUrl"/service-producer/user/student/intro"
curl -X GET  -H "Content-Type:application/json" $BaseUrl"/service-producer/user/teacher/intro"

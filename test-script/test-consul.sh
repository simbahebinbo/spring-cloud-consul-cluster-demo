#!/usr/bin/env bash

#测试 service-consumer 与 service-producer 是否正常交互

BaseUrl="http://172.18.18.141:9901"

curl -X GET  -H "Content-Type:application/json" $BaseUrl"/service-consumer/get-hi"

curl -X POST  -H "Content-Type:application/json" $BaseUrl"/service-consumer/post-hi"


curl -X GET  -H "Content-Type:application/json" $BaseUrl"/service-consumer/user/description"
curl -X GET  -H "Content-Type:application/json" $BaseUrl"/service-consumer/user/author"
curl -X GET  -H "Content-Type:application/json" $BaseUrl"/service-consumer/user/student/intro"
curl -X GET  -H "Content-Type:application/json" $BaseUrl"/service-consumer/user/teacher/intro"

#!/usr/bin/env bash

#测试 service-consumer 与 service-producer 是否正常交互

BaseUrl="http://172.18.18.141:9901"

curl -X GET  -H "Content-Type:application/json" $BaseUrl"/service-consumer/get-hi"
echo ""
curl -X POST  -H "Content-Type:application/json" -d '{"user": "admin", "passwd":"12345678"}' $BaseUrl"/service-consumer/post-hi"
echo ""
curl -X GET  -H "Content-Type:application/json" $BaseUrl"/service-consumer/user/description"
echo ""
curl -X GET  -H "Content-Type:application/json" $BaseUrl"/service-consumer/user/author"
echo ""
curl -X GET  -H "Content-Type:application/json" $BaseUrl"/service-consumer/user/student/intro"
echo ""
curl -X GET  -H "Content-Type:application/json" $BaseUrl"/service-consumer/user/teacher/intro"
echo ""

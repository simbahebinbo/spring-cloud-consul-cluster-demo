#!/usr/bin/env bash

#测试 service-producer 是否正常启动
BaseUrl="http://172.18.18.142:9900"

curl -X GET  -H "Content-Type:application/json" $BaseUrl"/service-producer/hello"
echo ""
curl -X GET  -H "Content-Type:application/json" $BaseUrl"/service-producer/get-hi"
echo ""
curl -X POST  -H "Content-Type:application/json" -d '{"user": "admin", "passwd":"12345678"}' $BaseUrl"/service-producer/post-hi"
echo ""
curl -X GET  -H "Content-Type:application/json" $BaseUrl"/service-producer/user/description"
echo ""
curl -X GET  -H "Content-Type:application/json" $BaseUrl"/service-producer/user/author"
echo ""
curl -X GET  -H "Content-Type:application/json" $BaseUrl"/service-producer/user/student/intro"
echo ""
curl -X GET  -H "Content-Type:application/json" $BaseUrl"/service-producer/user/teacher/intro"
echo ""

#!/bin/bash

#启动程序

#consul可执行文件
CONSUL_BIN=$1
#工作目录
WORK_DIR=$2
#consul的目录
CONSUL_DIR=$3
#应用程序名
APP_NAME=$4
#应用程序版本号
APP_VERSION=$5
#应用程序包名
APP_PACKAGE=${APP_NAME}-${APP_VERSION}.jar
#节点名
NODE_NAME=${APP_NAME}-$(hostname)
#网卡名
ADDR=eth0
#本地IP
LOCAL_IP=127.0.0.1

#获取容器IP
NODE_IP=$(ifconfig ${ADDR} | grep inet | grep -v ${LOCAL_IP} | grep -v inet6 | awk '{print $2}' | tr -d "addr:")

#启动consul
# 只允许当前ip注册，即只允许该容器内的应用程序注册到该consul节点
# 以 client 模式启动
# 加入到 server 模式 的节点组成的集群
${CONSUL_BIN} agent \
-bootstrap-expect=0 \
-advertise=${NODE_IP} -bind=${NODE_IP} -client=${LOCAL_IP} \
-node=${NODE_NAME} \
-data-dir=${CONSUL_DIR}/data \
-log-file=${CONSUL_DIR}/log/${APP_NAME}.log -log-level=INFO \
-join=172.18.18.141 -join=172.18.18.142 -join=172.18.18.143 -join=172.18.18.144 -join=172.18.18.145 -join=172.18.18.146

#启动应用程序
java -jar  \
-DCONSUL_NODES=127.0.0.1:8500,172.18.18.141:8500,172.18.18.142:8500,172.18.18.143:8500,172.18.18.144:8500,172.18.18.145:8500,172.18.18.146:8500 \
${APP_PACKAGE}

#保持容器不退出
while true;do
   sleep 100000
done


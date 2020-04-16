#!/bin/bash

#启动程序

#consul的目录
CONSUL_DIR=$1
#应用程序名
APP_NAME=$2
#consul集群的 server agent 链表
CONSUL_SERVERS=$3
#节点名
NODE_NAME=${APP_NAME}-$(hostname)
#网卡名
ADDR=eth0
#本地IP
LOCAL_IP=127.0.0.1

#获取容器IP
NODE_IP=$(ifconfig ${ADDR} | grep inet | grep -v ${LOCAL_IP} | grep -v inet6 | awk '{print $2}' | tr -d "addr:")

#启动应用程序
JAVA_EXEC_SCRIPT="java -jar "
JAVA_EXEC_SCRIPT=${JAVA_EXEC_SCRIPT}" -DCONSUL_NODES=127.0.0.1:8500,"${CONSUL_SERVERS}
JAVA_EXEC_SCRIPT=${JAVA_EXEC_SCRIPT}" app.jar "
nohup ${JAVA_EXEC_SCRIPT} > /dev/null 2>&1 &

#启动consul
# 只允许当前ip注册，即只允许该容器内的应用程序注册到该consul节点
# 以 client 模式启动
# 加入到 server 模式 的节点组成的集群
CONSUL_EXEC_SCRIPT="consul agent -bootstrap-expect=0 -advertise=${NODE_IP} -bind=${NODE_IP} -client=${LOCAL_IP} -node=${NODE_NAME} -data-dir=${CONSUL_DIR}/data -log-file=${CONSUL_DIR}/log/${APP_NAME}.log -log-level=INFO"

for consul_server in $(echo ${CONSUL_SERVERS} | tr ',' ' '); do
  SERVER_IP=$(echo ${consul_server} | awk -F: '{print $1}')
  CONSUL_EXEC_SCRIPT=${CONSUL_EXEC_SCRIPT}" -join="${SERVER_IP}
done

exec ${CONSUL_EXEC_SCRIPT}

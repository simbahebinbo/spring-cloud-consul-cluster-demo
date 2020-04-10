#!/usr/bin/env bash

CurrentDir=$(dirname $0)
DockerDir=${CurrentDir}/docker
ConsumerJarName=service-consumer-1.0.0.jar
ProducerJarName=service-producer-1.0.0.jar
CONSUMER_APPLICATION_NAME=service-consumer
PRODUCER_APPLICATION_NAME=service-producer

#编译打包
gradle wrapper
find ${CurrentDir} -name "build" | xargs rm -rf
find ${CurrentDir} -name "out" | xargs rm -rf
${CurrentDir}/gradlew clean build -x test

#复制jar包
cp ${CurrentDir}/service-consumer/build/libs/${ConsumerJarName} ${DockerDir}
cp ${CurrentDir}/service-producer/build/libs/${ProducerJarName} ${DockerDir}

#进入docker目录
cd ${DockerDir}
#构建消费者docker镜像
./build-consumer-docker.sh
#构建生产者docker镜像
./build-producer-docker.sh

#清理jar包
rm ${ConsumerJarName}
rm ${ProducerJarName}

#退出docker目录
cd -

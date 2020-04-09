#!/usr/bin/env bash

CurrentDir=$(dirname $0)
DockerDir=${CurrentDir}/docker
ConsumerJarName=service-consumer-1.0.0.jar
ProducerJarName=service-producer-1.0.0.jar
CONSUMER_APPLICATION_NAME=service-consumer
PRODUCER_APPLICATION_NAME=service-producer

#编译打包
find ${CurrentDir} -name "build" | xargs rm -rf
find ${CurrentDir} -name "out" | xargs rm -rf
${CurrentDir}/gradlew clean build -x test

#构建消费者docker镜像
cp ${CurrentDir}/service-consumer/build/libs/${ConsumerJarName} ${DockerDir}

docker build --build-arg APPLICATION_NAME=${CONSUMER_APPLICATION_NAME} -t ${CONSUMER_APPLICATION_NAME} -f ${DockerDir}/Dockerfile .

rm ${DockerDir}/${ConsumerJarName}

#构建生产者docker镜像
cp ${CurrentDir}/service-producer/build/libs/${ProducerJarName} ${DockerDir}

docker build --build-arg APPLICATION_NAME=${PRODUCER_APPLICATION_NAME} -t ${PRODUCER_APPLICATION_NAME} -f ${DockerDir}/Dockerfile .

rm ${DockerDir}/${ProducerJarName}

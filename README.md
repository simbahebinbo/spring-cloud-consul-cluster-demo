### spring-cloud-consul-cluster-demo

使用spring-cloud-starter-consul-cluster的样例程序，并使用docker部署。

#### 在consul的kv中配置：

1、新建目录

```
config/service-producer,local/
```

2、新建yaml文件,文件名为: 

```
service-producer
```

在yaml文件中添加

```
description: 用户信息描述
author: 作者
student:
  name: Jack
  age: 18
teacher:
  name: 张三
  course: java开发
```


```
$ java -jar -DCONSUL_NODES=localhost:8500 service-producer/build/libs/service-producer-1.0.0.jar
$ java -jar -DCONSUL_NODES=localhost:8500 service-consumer/build/libs/service-consumer-1.0.0.jar
```


构建docker镜像

```
$ ./build-all-docker.sh 
```

启动docker镜像
``` 
$ cd docker
$ ./start-consumer-docker.sh
$ ./start-producer-docker.sh
```

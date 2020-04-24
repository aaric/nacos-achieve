# nacos-achieve

[![license](https://img.shields.io/badge/license-MIT-green.svg?style=flat&logo=github)](https://www.mit-license.org)
[![java](https://img.shields.io/badge/java-11-brightgreen.svg?style=flat&logo=java)](https://www.oracle.com/java/technologies/javase-downloads.html)
[![gradle](https://img.shields.io/badge/gradle-5.6.2-brightgreen.svg?style=flat&logo=gradle)](https://docs.gradle.org/5.6.2/userguide/installation.html)
[![build](https://github.com/aaric/nacos-achieve/workflows/build/badge.svg)](https://github.com/aaric/nacos-achieve/actions)
[![release](https://img.shields.io/badge/release-0.4.0-blue.svg)](https://github.com/aaric/nacos-achieve/releases)

> [Nacos Learning.](https://nacos.io/zh-cn/docs/what-is-nacos.html)

## 服务端

### 下载安装

```bash
# su - admin
# https://github.com/alibaba/nacos/releases
sudo tar zxvf nacos-server-1.2.1.tar.gz  -C /opt
sudo chown -R admin:admin /opt/nacos
```

### 以`standalone`模式启动

```bash
# su - admin
/opt/nacos/bin/startup.sh -m standalone
```

### 浏览器访问

[http://localhost:8848/nacos](http://localhost:8848/nacos)

- 访问账号：nacos
- 访问密码：nacos

## 配置中心

### YAML配置示例

```yaml
# Spring settings
spring:
  application:
    name: nacos-cloud-server
  cloud:
    nacos:
      config:
        server-addr: 127.0.0.1:8848
        file-extension: yml
        group: SERVER_GROUP
        namespace: 01ecc33d-de4b-42c8-9500-cb907dc72b17
        extension-configs[0]:
          data-id: simple-app.yml
          group: DEFAULT_GROUP
          refresh: true
        shared-configs[0]:
          data-id: simple-shared.yml
          group: DEFAULT_GROUP
          refresh: false
```

### 接口调用测试示例

```bash
curl -X POST "http://localhost:8848/nacos/v1/cs/configs?dataId=title&group=test&content=Hello%20World"
curl -X GET "http://localhost:8848/nacos/v1/cs/configs?dataId=title&group=test"
```

## 服务发现

### YAML配置示例

```yaml
# Spring settings
spring:
  application:
    name: nacos-cloud-producer
  cloud:
    nacos:
      discovery:
        server-addr: 127.0.0.1:8848
        group: SERVER_GROUP
        namespace: 01ecc33d-de4b-42c8-9500-cb907dc72b17
```

### 监控地址（单个服务）

[http://localhost:8081/actuator/nacos-discovery](http://localhost:8081/actuator/nacos-discovery)

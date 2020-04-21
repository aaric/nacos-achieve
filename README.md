# nacos-achieve

[![license](https://img.shields.io/badge/license-MIT-green.svg?style=flat&logo=github)](https://www.mit-license.org)
[![java](https://img.shields.io/badge/java-11-brightgreen.svg?style=flat&logo=java)](https://www.oracle.com/java/technologies/javase-downloads.html)
[![gradle](https://img.shields.io/badge/gradle-5.6.2-brightgreen.svg?style=flat&logo=gradle)](https://docs.gradle.org/5.6.2/userguide/installation.html)
[![build](https://github.com/aaric/nacos-achieve/workflows/build/badge.svg)](https://github.com/aaric/nacos-achieve/actions)
[![release](https://img.shields.io/badge/release-0.3.0-blue.svg)](https://github.com/aaric/nacos-achieve/releases)

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

[http://k8s-master:8848/nacos](http://k8s-master:8848/nacos)

- 访问账号：nacos
- 访问密码：nacos

### 测试

```bash
curl -X POST "http://localhost:8848/nacos/v1/cs/configs?dataId=title&group=test&content=Hello%20World"
curl -X GET "http://localhost:8848/nacos/v1/cs/configs?dataId=title&group=test"
```

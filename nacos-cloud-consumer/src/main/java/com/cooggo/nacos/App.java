package com.cooggo.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务发现测试（消费者）启动类
 *
 * @author Aaric, created on 2020-04-23T11:04.
 * @version 0.4.0-SNAPSHOT
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class App {

    /**
     * Main
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

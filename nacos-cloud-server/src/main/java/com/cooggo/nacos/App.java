package com.cooggo.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * 服务启动类
 *
 * @author Aaric, created on 2020-04-21T19:52.
 * @version 0.3.0-SNAPSHOT
 */
@RefreshScope
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

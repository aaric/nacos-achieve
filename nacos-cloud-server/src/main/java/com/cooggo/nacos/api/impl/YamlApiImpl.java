package com.cooggo.nacos.api.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.WebApplicationObjectSupport;

/**
 * Yaml文件读取测试控制器
 *
 * @author Aaric, created on 2020-04-22T12:04.
 * @version 0.3.0-SNAPSHOT
 */
@Slf4j
@RestController
@RequestMapping("/yaml")
public class YamlApiImpl extends WebApplicationObjectSupport {

    @Value("${app.name}")
    private String appName;

    @GetMapping("/appName")
    public String appName() {
        // 打印日志
        log.info("appName: {}", appName);
        return appName;
    }

    /**
     * http://localhost:8080/yaml/read?key=custom.title
     */
    @GetMapping("/read")
    public String read(@RequestParam String key) {
        // 读取配置文件
        String content = getApplicationContext().getEnvironment().getProperty(key);

        // 打印日志
        log.info("{}: {}", key, content);
        return content;
    }
}

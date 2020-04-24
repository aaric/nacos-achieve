package com.cooggo.nacos.api.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试生产者控制器
 *
 * @author Aaric, created on 2020-04-23T11:21.
 * @version 0.4.0-SNAPSHOT
 */
@Slf4j
@RestController
public class ProducerApiImpl {

    @GetMapping("/producer/sayHello")
    public String sayHello(@RequestParam String name) {
        log.info("Hi, {} !", name);
        return String.format("Hi, %s !", name);
    }
}

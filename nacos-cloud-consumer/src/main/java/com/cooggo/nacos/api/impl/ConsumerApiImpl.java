package com.cooggo.nacos.api.impl;

import com.cooggo.nacos.feign.ProducerApiFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试消费者控制器
 *
 * @author Aaric, created on 2020-04-23T11:20.
 * @version 0.4.0-SNAPSHOT
 */
@Slf4j
@RestController
public class ConsumerApiImpl {

    @Autowired
    private ProducerApiFeign producerApiFeign;

    @GetMapping("/consumer/greet")
    public String greet() {
        String greet = producerApiFeign.sayHello("consumer");
        log.info("greet -> {}", greet);
        return "From: " + greet;
    }
}

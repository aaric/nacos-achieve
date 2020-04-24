package com.cooggo.nacos.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 测试生产者Feign客户端调用
 *
 * @author Aaric, created on 2020-04-23T11:44.
 * @version 0.4.0-SNAPSHOT
 */
@FeignClient(value = "nacos-cloud-producer")
public interface ProducerApiFeign {

    @GetMapping("/producer/sayHello")
    String sayHello(@RequestParam String name);
}

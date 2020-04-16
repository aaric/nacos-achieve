package com.cooggo.nacos;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Properties;

/**
 * NacosClientTests
 *
 * @author Aaric, created on 2020-04-15T11:12.
 * @version 0.1.0-SNAPSHOT
 */
@Slf4j
public class NacosClientTests {

    String serverAddr = "k8s-master:8848";
    String dataId = "simple-app.yml";
    String group = "DEFAULT_GROUP";
    String namespace = "01ecc33d-de4b-42c8-9500-cb907dc72b17";

    @Test
    @Disabled
    public void testGetConfig() throws Exception {
        ConfigService configService = NacosFactory.createConfigService(serverAddr);
        String content = configService.getConfig(dataId, group, 5000);
        log.info(content);
        Assertions.assertNotNull(content);
    }

    @Test
    @Disabled
    public void testGetConfigWithNS() throws Exception {
        Properties properties = new Properties();
        properties.put("serverAddr", serverAddr);
        properties.put("namespace", namespace);
        ConfigService configService = NacosFactory.createConfigService(properties);
        String content = configService.getConfig(dataId, group, 5000);
        log.info(content);
        Assertions.assertNotNull(content);
    }
}

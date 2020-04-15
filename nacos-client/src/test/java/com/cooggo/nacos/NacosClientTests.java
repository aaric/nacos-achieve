package com.cooggo.nacos;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * NacosClientTests
 *
 * @author Aaric, created on 2020-04-15T11:12.
 * @version 0.1.0-SNAPSHOT
 */
@Slf4j
public class NacosClientTests {

    @Test
    @Disabled
    public void testGetConfig() throws Exception {
        String serverAddr = "k8s-master:8848";
        String queryDataId = "simple-app-dev.yml";
        String queryGroupName = "DEFAULT_GROUP";

        ConfigService configService = NacosFactory.createConfigService(serverAddr);
        String content = configService.getConfig(queryDataId, queryGroupName, 5000);
        log.info(content);
        Assertions.assertNotNull(content);
    }
}

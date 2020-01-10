package com.asura.nacos_test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import java.util.HashMap;

@RefreshScope
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${useLocalCache:true}")
    private boolean useLocalCache;

    @Value("${name:local}")
    private String name;

    @RequestMapping("/config")
    public Object allConfig() {
        return new HashMap<Object, Object>(2) {
            {
                put("useLocalCache", useLocalCache);
                put("name", name);
            }
        };
    }
    @RequestMapping("/name")
    public String getName() {
        return name;
    }
}

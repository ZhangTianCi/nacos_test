package com.asura.nacos_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosTestApplication.class, args);
    }

}

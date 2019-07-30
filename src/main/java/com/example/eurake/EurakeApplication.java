package com.example.eurake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//当前服务是一个Eureka的客户端
@EnableDiscoveryClient
@SpringBootApplication
public class EurakeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurakeApplication.class, args);
    }

}

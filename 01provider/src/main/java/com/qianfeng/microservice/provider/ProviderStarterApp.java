package com.qianfeng.microservice.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.qianfeng.microservice.provider.mapper"})
public class ProviderStarterApp {

    public static void main(String[] args) {
        SpringApplication.run(ProviderStarterApp.class,args);
    }
}

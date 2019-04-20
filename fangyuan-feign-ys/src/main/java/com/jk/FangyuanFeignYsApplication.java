package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.jk.*")
public class FangyuanFeignYsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FangyuanFeignYsApplication.class, args);
    }

}

package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.jk.*")

public class FangyuanFeignRhjApplication {

    public static void main(String[] args) {
        SpringApplication.run(FangyuanFeignRhjApplication.class, args);
    }

}

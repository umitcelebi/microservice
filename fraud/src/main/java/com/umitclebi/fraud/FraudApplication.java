package com.umitclebi.fraud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * User: ucelebi
 * Date: 24.08.2023
 * Time: 22:13
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FraudApplication {
    public static void main(String[] args) {
        SpringApplication.run(FraudApplication.class, args);
    }
}

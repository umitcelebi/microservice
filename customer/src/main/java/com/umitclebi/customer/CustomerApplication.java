package com.umitclebi.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * User: ucelebi
 * Date: 20.08.2023
 * Time: 11:22
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.umitclebi.clients")
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
}

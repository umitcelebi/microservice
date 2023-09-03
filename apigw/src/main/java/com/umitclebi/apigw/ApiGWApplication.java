package com.umitclebi.apigw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * User: ucelebi
 * Date: 2.09.2023
 * Time: 10:55
 */
@SpringBootApplication
@EnableEurekaClient
public class ApiGWApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiGWApplication.class, args);
    }
}

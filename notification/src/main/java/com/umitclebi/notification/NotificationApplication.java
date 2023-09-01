package com.umitclebi.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * User: ucelebi
 * Date: 1.09.2023
 * Time: 21:38
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class NotificationApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }
}

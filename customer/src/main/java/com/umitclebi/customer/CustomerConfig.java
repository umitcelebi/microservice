package com.umitclebi.customer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * User: ucelebi
 * Date: 25.08.2023
 * Time: 10:52
 */
@Configuration
public class CustomerConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

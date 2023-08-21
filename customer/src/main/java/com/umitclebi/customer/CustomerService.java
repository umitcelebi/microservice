package com.umitclebi.customer;

import org.springframework.stereotype.Service;

/**
 * User: ucelebi
 * Date: 20.08.2023
 * Time: 14:20
 */
@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void register(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        // todo: check if email valid
        // todo: check if email not taken
        customerRepository.save(customer);
    }
}

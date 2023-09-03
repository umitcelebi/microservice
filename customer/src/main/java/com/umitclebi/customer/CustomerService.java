package com.umitclebi.customer;

import com.umitclebi.amqp.RabbitMQMessageProducer;
import com.umitclebi.clients.fraud.FraudCheckResponse;
import com.umitclebi.clients.fraud.FraudClient;
import com.umitclebi.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * User: ucelebi
 * Date: 20.08.2023
 * Time: 14:20
 */
@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final FraudClient fraudClient;
    private final RabbitMQMessageProducer rabbitMQMessageProducer;

    public void register(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        // todo: check if email valid
        // todo: check if email not taken
        customerRepository.saveAndFlush(customer);
        // todo: check if fraudster

        FraudCheckResponse fraudCheckResponse = fraudClient.isFraudster(customer.getId());

        if (fraudCheckResponse != null && fraudCheckResponse.isFraudster()) {
            throw new IllegalStateException("fraudster");
        }
        NotificationRequest notificationRequest = new NotificationRequest(customer.getId(), customer.getEmail(), String.format("Hi %s, welcome to Microservice Project.", customer.getFirstName()));

        rabbitMQMessageProducer.publish(
                notificationRequest,
                "internal.exchange",
                "internal.notification.routing-key");
    }
}

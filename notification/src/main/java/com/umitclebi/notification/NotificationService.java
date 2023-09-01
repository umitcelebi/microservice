package com.umitclebi.notification;

import com.umitclebi.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * User: ucelebi
 * Date: 1.09.2023
 * Time: 21:48
 */
@Service
@AllArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public void send(NotificationRequest notificationRequest) {
        notificationRepository.save(
                Notification.builder()
                        .toCustomerId(notificationRequest.toCustomerId())
                        .toCustomerEmail(notificationRequest.toCustomerName())
                        .sender("umitcelebi")
                        .message(notificationRequest.message())
                        .sentAt(LocalDateTime.now())
                        .build()
        );
    }
}

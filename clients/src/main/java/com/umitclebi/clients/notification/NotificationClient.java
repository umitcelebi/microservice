package com.umitclebi.clients.notification;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * User: ucelebi
 * Date: 1.09.2023
 * Time: 21:52
 */
@FeignClient(
        name = "notification",
        url ="${clients.notification.url}"
)
public interface NotificationClient {
    @PostMapping("api/v1/notification")
    void sendNotification(NotificationRequest notificationRequest);
}

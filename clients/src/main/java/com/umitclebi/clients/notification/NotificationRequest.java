package com.umitclebi.clients.notification;

/**
 * User: ucelebi
 * Date: 1.09.2023
 * Time: 21:47
 */
public record NotificationRequest(
        Integer toCustomerId,
        String toCustomerName,
        String message
) {
}

package com.umitclebi.notification;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * User: ucelebi
 * Date: 1.09.2023
 * Time: 21:42
 */
public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}

package com.umitclebi.notification;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.time.LocalDateTime;

/**
 * User: ucelebi
 * Date: 1.09.2023
 * Time: 21:39
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Notification {

    @Id
    @SequenceGenerator(name = "notification_id_sequence",sequenceName = "notification_id_sequence")
    @GeneratedValue(generator = "notification_id_sequence",strategy = GenerationType.SEQUENCE)
    private Integer notificationId;
    private Integer toCustomerId;
    private String toCustomerEmail;
    private String sender;
    private String message;
    private LocalDateTime sentAt;
}

package com.company.kotlinapp_apis.model.notification;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class ApplicationNotification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId;
    private String text;
    @Enumerated(EnumType.STRING)
    private NotificationRole role;
}

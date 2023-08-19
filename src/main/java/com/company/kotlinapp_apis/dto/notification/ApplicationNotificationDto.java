package com.company.kotlinapp_apis.dto.notification;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class ApplicationNotificationDto {
    private Long id;

    private String userId;
    private String text;
}

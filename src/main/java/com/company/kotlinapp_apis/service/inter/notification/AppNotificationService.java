package com.company.kotlinapp_apis.service.inter.notification;

import com.company.kotlinapp_apis.dto.notification.ApplicationNotificationDto;
import com.company.kotlinapp_apis.model.notification.NotificationRole;

import javax.management.relation.Role;
import java.util.List;

public interface AppNotificationService {

    //adminNotification-get
    //adminNotification-post

    //courierNotification-get
    //courierNotification-post

    //shopNotification-get
    //shopNotification-post


    List<ApplicationNotificationDto> getNotificationByRole(NotificationRole role);

    ApplicationNotificationDto postNotificationByRole(ApplicationNotificationDto dto, NotificationRole role);


}

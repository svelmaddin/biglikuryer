package com.company.kotlinapp_apis.dao.notification;

import com.company.kotlinapp_apis.model.notification.ApplicationNotification;
import com.company.kotlinapp_apis.model.notification.NotificationRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppNotificationRepo extends JpaRepository<ApplicationNotification, Long> {
    List<ApplicationNotification> findByRole(NotificationRole role);
}

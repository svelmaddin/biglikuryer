package com.company.kotlinapp_apis.service.impl.notification;

import com.company.kotlinapp_apis.dao.notification.AppNotificationRepo;
import com.company.kotlinapp_apis.dto.notification.ApplicationNotificationDto;
import com.company.kotlinapp_apis.model.notification.ApplicationNotification;
import com.company.kotlinapp_apis.model.notification.NotificationRole;
import com.company.kotlinapp_apis.service.inter.notification.AppNotificationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AppNotificationServiceImpl implements AppNotificationService {
    private final AppNotificationRepo repo;

    public AppNotificationServiceImpl(AppNotificationRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<ApplicationNotificationDto> getNotificationByRole(NotificationRole role) {
        return repo.findByRole(role)
                .stream().map(this::convertFromDb).collect(Collectors.toList());
    }

    @Override
    public ApplicationNotificationDto postNotificationByRole(ApplicationNotificationDto dto, NotificationRole role) {
        ApplicationNotification db = ApplicationNotification.builder()
                .userId(dto.getUserId())
                .text(dto.getText())
                .role(role)
                .build();
        repo.save(db);
        return convertFromDb(db);
    }

    private ApplicationNotificationDto convertFromDb(ApplicationNotification from) {
        return ApplicationNotificationDto.builder()
                .id(from.getId())
                .userId(from.getUserId())
                .text(from.getText())
                .build();
    }
}

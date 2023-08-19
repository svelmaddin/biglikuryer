package com.company.kotlinapp_apis.api.notification;

import com.company.kotlinapp_apis.dto.notification.ApplicationNotificationDto;
import com.company.kotlinapp_apis.model.notification.NotificationRole;
import com.company.kotlinapp_apis.service.inter.notification.AppNotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class NotificationController {
    private final AppNotificationService service;

    public NotificationController(AppNotificationService service) {
        this.service = service;
    }

    @GetMapping("/adminNotification")
    public ResponseEntity<List<ApplicationNotificationDto>> getNotificationForAdmin() {
        return ResponseEntity.ok(service.getNotificationByRole(NotificationRole.ADMIN));
    }

    @PostMapping("/create/adminNotification")
    public ResponseEntity<ApplicationNotificationDto> postNotificationForAdmin(@RequestBody ApplicationNotificationDto dto) {
        return ResponseEntity.ok(service.postNotificationByRole(dto, NotificationRole.ADMIN));
    }

    @GetMapping("/shopNotification")
    public ResponseEntity<List<ApplicationNotificationDto>> getNotificationForShop() {
        return ResponseEntity.ok(service.getNotificationByRole(NotificationRole.SHOP));

    }

    @PostMapping("/create/shopNotification")
    public ResponseEntity<ApplicationNotificationDto> postNotificationForShop(@RequestBody ApplicationNotificationDto dto) {
        return ResponseEntity.ok(service.postNotificationByRole(dto, NotificationRole.SHOP));

    }

    @GetMapping("/courierNotification")
    public ResponseEntity<List<ApplicationNotificationDto>> getNotificationForCourier() {
        return ResponseEntity.ok(service.getNotificationByRole(NotificationRole.COURIER));

    }

    @PostMapping("/create/courierNotification")
    public ResponseEntity<ApplicationNotificationDto> postNotificationForCourier(@RequestBody ApplicationNotificationDto dto) {
        return ResponseEntity.ok(service.postNotificationByRole(dto, NotificationRole.COURIER));

    }
}

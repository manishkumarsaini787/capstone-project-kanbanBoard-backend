package com.niit.NotificationService.service;

import com.niit.NotificationService.domain.Notification;

import java.util.List;

public interface NotificationService {
    Notification saveNotification(Notification notification);
    List<Notification> getAllNotifications(String email);
}

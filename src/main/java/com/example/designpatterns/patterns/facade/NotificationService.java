package com.example.designpatterns.patterns.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class NotificationService {
    public void sendNotification(String customer, boolean approved) {
        if (approved) {
            log.info("Notification sent to {}: Your loan is approved!", customer);
        } else {
            log.info("Notification sent to {}: Your loan is rejected.", customer);
        }
    }
}
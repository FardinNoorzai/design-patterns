package com.example.designpatterns.patterns.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmailSender implements NotificationSender {
    Logger logger = LoggerFactory.getLogger(EmailSender.class);

    @Override
    public void sendNotification(NotificationRequest notificationRequest) {
        logger.info("Sending email notification request id {} to : {}",notificationRequest.getRequestId(),notificationRequest.getTo());
        throw new RuntimeException("Sending email notification request id "+notificationRequest.getRequestId() + " failed");
    }
}

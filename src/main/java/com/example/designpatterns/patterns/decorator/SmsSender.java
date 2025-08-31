package com.example.designpatterns.patterns.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmsSender implements NotificationSender {
    Logger logger = LoggerFactory.getLogger(SmsSender.class);

    @Override
    public void sendNotification(NotificationRequest notificationRequest) {
        logger.info("Sending sms notification request id {} to : {}",notificationRequest.getRequestId(),notificationRequest.getTo());
    }
}

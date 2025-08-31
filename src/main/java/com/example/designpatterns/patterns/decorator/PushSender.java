package com.example.designpatterns.patterns.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PushSender implements NotificationSender {
    Logger logger = LoggerFactory.getLogger(PushSender.class);

    @Override
    public void sendNotification(NotificationRequest notificationRequest) {
        logger.info("Sending Push notification request id {} to : {}",notificationRequest.getRequestId(),notificationRequest.getTo());
    }
}

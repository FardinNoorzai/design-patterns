package com.example.designpatterns.patterns.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RateLimiterDecorator extends SenderDecorator {
    Logger logger = LoggerFactory.getLogger(RateLimiterDecorator.class);
    public RateLimiterDecorator(NotificationSender notificationSender) {
        super(notificationSender);
    }

    @Override
    public void sendNotification(NotificationRequest notificationRequest) {
        logger.info("Applying rate limiter before sending notification");
        super.sendNotification(notificationRequest);
        logger.info("Updating rate limiter after sending notification");
    }
}

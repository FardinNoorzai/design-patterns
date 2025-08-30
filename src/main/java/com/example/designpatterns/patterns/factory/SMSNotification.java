package com.example.designpatterns.patterns.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SMSNotification implements Notification {
    Logger logger = LoggerFactory.getLogger(SMSNotification.class);
    @Override
    public void send(String msg, String to) {
        logger.info("SMS Notification sending to {}: {}", to, msg);
    }
}

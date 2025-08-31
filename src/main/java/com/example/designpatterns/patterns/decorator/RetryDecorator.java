package com.example.designpatterns.patterns.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RetryDecorator extends SenderDecorator{
    Logger logger = LoggerFactory.getLogger(RetryDecorator.class);

    public RetryDecorator(NotificationSender notificationSender) {
        super(notificationSender);
    }

    @Override
    public void sendNotification(NotificationRequest notificationRequest) {
        boolean isSent = false;
        for(int i = 0; i < 3; i++) {
            try{
                super.sendNotification(notificationRequest);
                isSent = true;
                break;
            }catch(Exception e){
                logger.error(e.getMessage() + " retrying.....");
            }

        }
        logger.info("retry decorator was executed messages send status is {}",isSent);
    }
}

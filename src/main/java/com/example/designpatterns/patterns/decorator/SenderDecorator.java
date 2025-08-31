package com.example.designpatterns.patterns.decorator;

public abstract class SenderDecorator implements NotificationSender {
    protected final NotificationSender notificationSender;

    public SenderDecorator(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    @Override
    public void sendNotification(NotificationRequest notificationRequest) {
        notificationSender.sendNotification(notificationRequest);
    }
}

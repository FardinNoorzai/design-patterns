package com.example.designpatterns.patterns.factory;

import com.example.designpatterns.patterns.facade.LoanFacade;

public class Main {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification service1 = notificationFactory.getNotificationService("SMS");
        service1.send("A meaningful message","Fardin");
        Notification service2 = notificationFactory.getNotificationService("Email");
        service2.send("A meaningful message","Fardin");
    }
}

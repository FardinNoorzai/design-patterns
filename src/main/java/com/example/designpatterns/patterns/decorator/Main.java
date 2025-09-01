package com.example.designpatterns.patterns.decorator;

import java.util.Map;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        NotificationRequest notificationRequest1 = new NotificationRequest();
        notificationRequest1.setRequestId(UUID.randomUUID().toString());
        notificationRequest1.setChannel("Email");
        notificationRequest1.setData(Map.of());
        notificationRequest1.setTo("example@gmail.com");
        NotificationSender sender1 = new RateLimiterDecorator(
                new RetryDecorator(
                        new EmailSender()
                )
        );
        sender1.sendNotification(notificationRequest1);

        NotificationRequest notificationRequest2 = new NotificationRequest();
        notificationRequest2.setRequestId(UUID.randomUUID().toString());
        notificationRequest2.setChannel("Push");
        notificationRequest2.setData(Map.of());
        notificationRequest2.setTo("<<Device token>>");
        NotificationSender sender2 = new RateLimiterDecorator(
                new RetryDecorator(
                        new PushSender()
                )
        );
        sender2.sendNotification(notificationRequest2);
    }
}

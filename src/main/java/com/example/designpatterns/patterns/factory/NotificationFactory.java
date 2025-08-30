package com.example.designpatterns.patterns.factory;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

public class NotificationFactory {

    Map<String, Notification> notifications = new HashMap<>();

    public NotificationFactory() {
        init();
    }

    public Notification getNotificationService(String type){
        if(type.equalsIgnoreCase("SMS")){
          return notifications.get("SMS");
        }else if(type.equalsIgnoreCase("EMAIL")){
            return notifications.get("EMAIL");
        }else if(type.equalsIgnoreCase("PUSH")){
            return notifications.get("PUSH");
        }else{
            throw new IllegalArgumentException("Invalid notification type");
        }
    }


    public void init(){
        notifications.put("SMS",new SMSNotification());
        notifications.put("EMAIL",new EmailNotification());
        notifications.put("PUSH",new PushNotification());
    }
}

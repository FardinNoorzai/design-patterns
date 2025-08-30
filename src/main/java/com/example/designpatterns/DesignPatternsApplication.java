package com.example.designpatterns;

import com.example.designpatterns.patterns.observer.DataSource;
import com.example.designpatterns.patterns.observer.DummyUiComponent1;
import com.example.designpatterns.patterns.observer.DummyUiComponent2;
import com.example.designpatterns.patterns.observer.DummyUiComponent3;

public class DesignPatternsApplication {

    public static void main(String[] args) {

//        SingletonExample example = SingletonExample.getInstance();
//        example.logHello();
//
//        SingletonExample example2 = SingletonExample.getInstance();
//        example2.logHello();

        // Factory pattern
//        NotificationFactory notificationFactory = new NotificationFactory();
//        Notification service1 = notificationFactory.getNotificationService("SMS");
//        service1.send("A meaningful message","Fardin");
//        Notification service2 = notificationFactory.getNotificationService("Email");
//        service2.send("A meaningful message","Fardin");


        // Observer pattern
        DataSource dataSource = new DataSource();
        DummyUiComponent1 component1 = new DummyUiComponent1(dataSource);
        DummyUiComponent2 component2 = new DummyUiComponent2(dataSource);
        DummyUiComponent3 component3 = new DummyUiComponent3(dataSource);
        dataSource.DataChanged("Data has changed UI is updating");
        component1.unregisterObserver();
        dataSource.DataChanged("Data has changed again UI is updating");

    }

}

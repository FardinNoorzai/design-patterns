package com.example.designpatterns;

import com.example.designpatterns.patterns.builder.Computer;
import com.example.designpatterns.patterns.strategy.CommissionService;
import com.example.designpatterns.patterns.strategy.CommissionStrategy;
import com.example.designpatterns.patterns.strategy.CrossProvinceStrategy;
import com.example.designpatterns.patterns.strategy.VipPartnerStrategy;

public class DesignPatternsApplication {

    public static void main(String[] args) {

        // Singleton pattern
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
//        DataSource dataSource = new DataSource();
//        DummyUiComponent1 component1 = new DummyUiComponent1(dataSource);
//        DummyUiComponent2 component2 = new DummyUiComponent2(dataSource);
//        DummyUiComponent3 component3 = new DummyUiComponent3(dataSource);
//        dataSource.DataChanged("Data has changed UI is updating");
//        component1.unregisterObserver();
//        dataSource.DataChanged("Data has changed again UI is updating");


        // Builder pattern
//        Computer computer1 = new Computer.ComputerBuilder()
//                .cpu("Core i5")
//                .storage("1TB")
//                .ram("16GB")
//                .storageType("SSD")
//                .coolingSystem(true)
//                .color("White")
//                .build();
//
//        Computer computer2 = new Computer.ComputerBuilder()
//                .cpu("Core i7")
//                .storage("1TB")
//                .ram("32GB")
//                .coolingSystem(true)
//                .color("Black")
//                .build();
//
//
//        System.out.println(computer1);
//        System.out.println(computer2);

        // Strategy Pattern
        CommissionStrategy commissionStrategy1 = new CrossProvinceStrategy();
        CommissionStrategy commissionStrategy2 = new VipPartnerStrategy();

        CommissionService commissionService = new CommissionService(commissionStrategy1);
        commissionService.calculateCommission(commissionStrategy2);
        commissionService.calculateCommission(commissionStrategy1);


    }

}

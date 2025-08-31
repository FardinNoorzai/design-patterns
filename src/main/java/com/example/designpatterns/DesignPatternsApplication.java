package com.example.designpatterns;

import com.example.designpatterns.patterns.adapter.*;
import com.example.designpatterns.patterns.decorator.*;
import com.example.designpatterns.patterns.iterator.Iterator;
import com.example.designpatterns.patterns.iterator.User;
import com.example.designpatterns.patterns.iterator.UserRepository;
import com.example.designpatterns.patterns.state.CashDeviceController;
import com.example.designpatterns.patterns.state.DisconnectedState;

import java.math.BigDecimal;
import java.util.*;

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
//        CommissionStrategy commissionStrategy1 = new CrossProvinceStrategy();
//        CommissionStrategy commissionStrategy2 = new VipPartnerStrategy();
//
//        CommissionService commissionService = new CommissionService(commissionStrategy1);
//        commissionService.calculateCommission(commissionStrategy2);
//        commissionService.calculateCommission(commissionStrategy1);


        // Decorator
//        NotificationRequest notificationRequest1 = new NotificationRequest();
//        notificationRequest1.setRequestId(UUID.randomUUID().toString());
//        notificationRequest1.setChannel("Email");
//        notificationRequest1.setData(Map.of());
//        notificationRequest1.setTo("example@gmail.com");
//        NotificationSender sender1 = new RateLimiterDecorator(
//                new RetryDecorator(
//                        new EmailSender()
//                )
//        );
//        sender1.sendNotification(notificationRequest1);
//
//        NotificationRequest notificationRequest2 = new NotificationRequest();
//        notificationRequest2.setRequestId(UUID.randomUUID().toString());
//        notificationRequest2.setChannel("Push");
//        notificationRequest2.setData(Map.of());
//        notificationRequest2.setTo("<<Device token>>");
//        NotificationSender sender2 = new RateLimiterDecorator(
//                new RetryDecorator(
//                        new PushSender()
//                )
//        );
//        sender2.sendNotification(notificationRequest2);

        //Adapter Pattern
//        PaymentGateway naqdpayGateway = new NaqdPayAdapter();
//        PaymentGateway paypalGateway = new PaypalAdapter();
//        PaymentGateway stripeGateway = new StripeAdapter();
//
//        CheckoutService checkoutService = new CheckoutService(paypalGateway);
//        checkoutService.checkout(UUID.randomUUID().toString(), BigDecimal.valueOf(100.56));
//
//        checkoutService.setPaymentGateway(stripeGateway);
//        checkoutService.checkout(UUID.randomUUID().toString(), BigDecimal.valueOf(100.56));
//
//        checkoutService.setPaymentGateway(naqdpayGateway);
//        checkoutService.refund(UUID.randomUUID().toString(), BigDecimal.valueOf(100.56));


        //State pattern
//        CashDeviceController device = new CashDeviceController(new DisconnectedState());
//        device.open();
//        device.handshake();
//        device.accept();
//        device.close();
//        device.open();
//        device.handshake();


        //iterator

        User user1 = new User("John", "Doe");
        User user2 = new User("Jane", "Doe");
        User user3 = new User("Alis", "Doe");
        User user4 = new User("Bob", "Doe");
        User user5 = new User("Markus", "Doe");

        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        UserRepository userRepository = new UserRepository();
        userRepository.setUsers(users);
        userRepository.add(user4);
        userRepository.add(user5);

        Iterator<User> userIterator = userRepository.createIterator();
        while (userIterator.hasNext()) {
            User user = userIterator.next();
            System.out.println(user);
        }


    }



}

package com.example.designpatterns.patterns.state;

import com.example.designpatterns.patterns.flyweight.CharacterFactory;
import com.example.designpatterns.patterns.flyweight.Flyweight;

public class Main {
    public static void main(String[] args) {
        CashDeviceController device = new CashDeviceController(new DisconnectedState());
        device.open();
        device.handshake();
        device.accept();
        device.close();
        device.open();
        device.handshake();

    }
}

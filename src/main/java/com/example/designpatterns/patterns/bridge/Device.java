package com.example.designpatterns.patterns.bridge;

public abstract class Device {

    Connection connection;

    public Device(Connection connection) {
        this.connection = connection;
    }

    public abstract void performAction(String data);

}

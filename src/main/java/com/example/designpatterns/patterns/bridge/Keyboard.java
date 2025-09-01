package com.example.designpatterns.patterns.bridge;

public class Keyboard extends Device {
    public Keyboard(Connection connection) {
        super(connection);
    }

    @Override
    public void performAction(String data) {
        super.connection.send(data);
    }
    public void close() {
        super.connection.disconnect();
    }
    public void connect() {
        super.connection.connect();
    }
}

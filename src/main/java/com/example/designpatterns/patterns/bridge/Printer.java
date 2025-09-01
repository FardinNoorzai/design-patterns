package com.example.designpatterns.patterns.bridge;

public class Printer extends Device{
    public Printer(Connection connection) {
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

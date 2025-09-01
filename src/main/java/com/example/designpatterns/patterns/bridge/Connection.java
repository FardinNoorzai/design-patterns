package com.example.designpatterns.patterns.bridge;

public interface Connection {
    public void connect();
    public void disconnect();
    public void send(String message);
}

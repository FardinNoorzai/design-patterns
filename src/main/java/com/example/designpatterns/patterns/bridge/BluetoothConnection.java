package com.example.designpatterns.patterns.bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BluetoothConnection implements Connection {
    @Override
    public void connect() {
        log.info("Connect via BluetoothConnection");
    }

    @Override
    public void disconnect() {
        log.info("Disconnecting...");
    }

    @Override
    public void send(String message) {
        log.info("Sending message via bluetooth");
    }
}

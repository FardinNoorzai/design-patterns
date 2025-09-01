package com.example.designpatterns.patterns.bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TCPConnection implements Connection {
    @Override
    public void connect() {
        log.info("Connecting via TCP connection");
    }

    @Override
    public void disconnect() {
        log.info("Disconnecting....");
    }

    @Override
    public void send(String message) {
        log.info("Sending message via tcp link");
    }
}

package com.example.designpatterns.patterns.bridge;

import com.example.designpatterns.patterns.adapter.*;

import java.math.BigDecimal;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        TCPConnection tcpConnection = new TCPConnection();
        BluetoothConnection bluetoothConnection = new BluetoothConnection();
        Printer printer = new Printer(tcpConnection);
        Keyboard keyboard = new Keyboard(bluetoothConnection);

        printer.connect();
        printer.performAction("Hello World");
        printer.close();

        keyboard.connect();
        keyboard.performAction("Hello World");
        keyboard.close();
    }
}

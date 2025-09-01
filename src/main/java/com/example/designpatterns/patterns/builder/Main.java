package com.example.designpatterns.patterns.builder;

import com.example.designpatterns.patterns.bridge.BluetoothConnection;
import com.example.designpatterns.patterns.bridge.Keyboard;
import com.example.designpatterns.patterns.bridge.Printer;
import com.example.designpatterns.patterns.bridge.TCPConnection;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer.ComputerBuilder()
                .cpu("Core i5")
                .storage("1TB")
                .ram("16GB")
                .storageType("SSD")
                .coolingSystem(true)
                .color("White")
                .build();

        Computer computer2 = new Computer.ComputerBuilder()
                .cpu("Core i7")
                .storage("1TB")
                .ram("32GB")
                .coolingSystem(true)
                .color("Black")
                .build();


        System.out.println(computer1);
        System.out.println(computer2);
    }
}

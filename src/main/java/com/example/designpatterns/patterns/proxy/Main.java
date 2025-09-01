package com.example.designpatterns.patterns.proxy;


public class Main {
    public static void main(String[] args) {
        FileReader fileReader = new SimpleFileReader();
        FileReader proxy = new FileReaderProxy(fileReader,"admin1");
        proxy.read();
    }
}

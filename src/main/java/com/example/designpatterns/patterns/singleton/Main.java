package com.example.designpatterns.patterns.singleton;


public class Main {
    public static void main(String[] args) {
        SingletonExample example = SingletonExample.getInstance();
        example.logHello();

        SingletonExample example2 = SingletonExample.getInstance();
        example2.logHello();
    }
}

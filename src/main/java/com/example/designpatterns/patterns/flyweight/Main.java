package com.example.designpatterns.patterns.flyweight;

import com.example.designpatterns.patterns.factory.Notification;
import com.example.designpatterns.patterns.factory.NotificationFactory;

public class Main {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        String document = "Hello world. This is a test for flyweight";
        for (char c : document.toCharArray()) {
            Flyweight ch = factory.getCharacter(c);

            int fontSize = (int)(Math.random() * 10 + 12);
            String color = Math.random() > 0.5 ? "Red" : "Blue";

            ch.display(fontSize, color);
        }

        System.out.println("Total unique flyweights created: " + factory.getTotalFlyweights());
    }
}

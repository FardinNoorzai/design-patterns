package com.example.designpatterns.patterns.flyweight;

public class CharacterFlyweight implements Flyweight {
    private final char character;

    public CharacterFlyweight(char character) {
        this.character = character;
        System.out.println("Creating flyweight for character: " + character);
    }

    @Override
    public void display(int fontSize, String color) {
        System.out.println("Character: " + character + ", FontSize: " + fontSize + ", Color: " + color);
    }
}
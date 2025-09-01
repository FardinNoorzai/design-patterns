package com.example.designpatterns.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private Map<Character, Flyweight> flyweights = new HashMap<>();

    public Flyweight getCharacter(char c) {
        flyweights.putIfAbsent(c, new CharacterFlyweight(c));
        return flyweights.get(c);
    }

    public int getTotalFlyweights() {
        return flyweights.size();
    }
}
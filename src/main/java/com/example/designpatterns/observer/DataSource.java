package com.example.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class DataSource implements Observable{
    List<Observer> observers = new ArrayList<>();
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String data) {
        for (Observer observer : observers) {
            observer.onUpdate(data);
        }
    }


    public void DataChanged(String data) {
        notifyObserver(data);
    }
}

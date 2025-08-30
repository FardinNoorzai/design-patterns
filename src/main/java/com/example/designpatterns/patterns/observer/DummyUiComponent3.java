package com.example.designpatterns.patterns.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DummyUiComponent3 implements Observer {
    Logger logger = LoggerFactory.getLogger(DummyUiComponent3.class);
    Observable observable;
    public DummyUiComponent3(Observable  observable) {
        this.observable = observable;
        observable.registerObserver(this);
    }
    public void unregisterObserver() {
        observable.unregisterObserver(this);
    }
    @Override
    public void onUpdate(String data) {
        logger.info("New data: {}", data);
    }
}

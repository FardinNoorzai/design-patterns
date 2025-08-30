package com.example.designpatterns.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DummyUiComponent2 implements Observer {
    Observable observable;
    Logger logger = LoggerFactory.getLogger(DummyUiComponent2.class);
    public DummyUiComponent2(Observable  observable) {
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

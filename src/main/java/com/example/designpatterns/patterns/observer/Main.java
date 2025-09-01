package com.example.designpatterns.patterns.observer;


public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        DummyUiComponent1 component1 = new DummyUiComponent1(dataSource);
        DummyUiComponent2 component2 = new DummyUiComponent2(dataSource);
        DummyUiComponent3 component3 = new DummyUiComponent3(dataSource);
        dataSource.DataChanged("Data has changed UI is updating");
        component1.unregisterObserver();
        dataSource.DataChanged("Data has changed again UI is updating");
    }
}

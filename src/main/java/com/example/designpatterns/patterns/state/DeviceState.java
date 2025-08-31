package com.example.designpatterns.patterns.state;

public interface DeviceState {
    public void open(CashDeviceController cashDeviceController);
    public void handshake(CashDeviceController cashDeviceController);
    public void accept(CashDeviceController cashDeviceController);
    public void stopAccept(CashDeviceController cashDeviceController);
    public void dispense(CashDeviceController cashDeviceController);
    public void close(CashDeviceController cashDeviceController);
    public void status(CashDeviceController cashDeviceController);
}

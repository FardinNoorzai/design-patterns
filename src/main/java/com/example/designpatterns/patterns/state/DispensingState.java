package com.example.designpatterns.patterns.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DispensingState implements DeviceState{
    @Override
    public void open(CashDeviceController cashDeviceController) {
        throw new UnsupportedOperationException("Not supported.");

    }

    @Override
    public void handshake(CashDeviceController cashDeviceController) {
        throw new UnsupportedOperationException("Not supported.");

    }

    @Override
    public void accept(CashDeviceController cashDeviceController) {
        throw new UnsupportedOperationException("Not supported.");

    }

    @Override
    public void stopAccept(CashDeviceController cashDeviceController) {
        throw new UnsupportedOperationException("Not supported.");

    }

    @Override
    public void dispense(CashDeviceController cashDeviceController) {
        throw new UnsupportedOperationException("Not supported.");

    }

    @Override
    public void close(CashDeviceController cashDeviceController) {
        log.info(" going back to closed state");
        cashDeviceController.setDeviceState(new DispensingState());
    }

    @Override
    public void status(CashDeviceController cashDeviceController) {
        log.info("requesting status");
    }
}

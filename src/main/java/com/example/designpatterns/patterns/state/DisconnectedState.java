package com.example.designpatterns.patterns.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DisconnectedState implements DeviceState {
    Logger logger = LoggerFactory.getLogger(DisconnectedState.class);

    @Override
    public void open(CashDeviceController cashDeviceController) {
        logger.info("Disconnected State : changing state to connecting");
        cashDeviceController.setDeviceState(new ConnectingState());
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
        throw new UnsupportedOperationException("Not supported.");

    }

    @Override
    public void status(CashDeviceController cashDeviceController) {
        throw new UnsupportedOperationException("Not supported.");

    }
}

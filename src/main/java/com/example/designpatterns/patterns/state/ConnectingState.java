package com.example.designpatterns.patterns.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConnectingState implements DeviceState{
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public void open(CashDeviceController cashDeviceController) {
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public void handshake(CashDeviceController cashDeviceController) {
        logger.debug("Handshake started changing state to ready state");
        cashDeviceController.setDeviceState(new ReadyState());
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
        logger.debug("Close started changing state to Disconnected state");
        cashDeviceController.setDeviceState(new DisconnectedState());
    }

    @Override
    public void status(CashDeviceController cashDeviceController) {
        throw new UnsupportedOperationException("Not supported.");
    }
}

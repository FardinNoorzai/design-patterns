package com.example.designpatterns.patterns.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AcceptingState implements DeviceState{
    Logger logger = LoggerFactory.getLogger(this.getClass());
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
        logger.debug("Accepting cash device");
    }

    @Override
    public void stopAccept(CashDeviceController cashDeviceController) {
        logger.debug("Stopping cash device");
    }

    @Override
    public void dispense(CashDeviceController cashDeviceController) {
        throw new UnsupportedOperationException("Not supported.");

    }

    @Override
    public void close(CashDeviceController cashDeviceController) {
        logger.info("Close request going back to Disconnected state");
        cashDeviceController.setDeviceState(new DisconnectedState());
    }

    @Override
    public void status(CashDeviceController cashDeviceController) {
        logger.info("Status request");
    }
}

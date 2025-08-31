package com.example.designpatterns.patterns.state;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CashDeviceController {
    DeviceState  deviceState;

    public void open(){
        deviceState.open(this);
    }
    public void close(){
        deviceState.close(this);
    }
    public void handshake(){
        deviceState.handshake(this);
    }
    public void accept(){
        deviceState.accept(this);
    }
    public void stopAccept(){
        deviceState.stopAccept(this);
    }
    public void dispense(){
        deviceState.dispense(this);
    }
    public void status(){
        deviceState.status(this);
    }


}

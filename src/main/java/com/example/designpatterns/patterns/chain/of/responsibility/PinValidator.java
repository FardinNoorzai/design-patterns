package com.example.designpatterns.patterns.chain.of.responsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PinValidator implements TransactionHandler{
    TransactionHandler next;
    @Override
    public void setNext(TransactionHandler next) {
        this.next = next;
    }

    @Override
    public void handle(PaymentRequest request) {
        if(request.getPin().equalsIgnoreCase("1234")){
            log.info("Pin is valid");
            next.handle(request);
        }else{
            log.error("Invalid pin number exiting the chain");
        }
    }
}

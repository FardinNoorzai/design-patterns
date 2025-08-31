package com.example.designpatterns.patterns.chain.of.responsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CardValidator implements TransactionHandler{

    TransactionHandler next;

    @Override
    public void setNext(TransactionHandler next) {
        this.next = next;
    }

    @Override
    public void handle(PaymentRequest request) {
        if(request.getCard().equalsIgnoreCase("12345678")){
            log.info("Card number is valid");
            next.handle(request);
        }else{
            log.error("Invalid card number exiting the chain");
        }
    }
}

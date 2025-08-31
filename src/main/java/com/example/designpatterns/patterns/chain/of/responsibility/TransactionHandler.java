package com.example.designpatterns.patterns.chain.of.responsibility;

public interface TransactionHandler {

    public void setNext(TransactionHandler next);
    public void handle(PaymentRequest request);

}

package com.example.designpatterns.patterns.chain.of.responsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PaymentMethodValidator implements TransactionHandler {
    private TransactionHandler nextHandler;

    @Override
    public void setNext(TransactionHandler next) {
        this.nextHandler = next;
    }

    @Override
    public void handle(PaymentRequest request) {
        if (!"PayPal".equals(request.getPaymentType())) {
            log.warn("This payment method is not supported, exiting the chain");
            return;
        }

        if (nextHandler != null) {
            nextHandler.handle(request);
        } else {
            log.warn("End of the chain, exiting");
        }
    }
}

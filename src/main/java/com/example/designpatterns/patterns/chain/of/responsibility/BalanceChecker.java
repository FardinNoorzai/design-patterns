package com.example.designpatterns.patterns.chain.of.responsibility;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class BalanceChecker implements TransactionHandler {
    TransactionHandler next;

    @Override
    public void setNext(TransactionHandler next) {
        this.next = next;
    }

    @Override
    public void handle(PaymentRequest request) {
        if (request.getAmount().compareTo(BigDecimal.valueOf(300)) <= 0) {
            log.info("Enough balance");
            next.handle(request);
        } else {
            log.warn("Payment amount is too big exiting the chain");
        }
    }
}

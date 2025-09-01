package com.example.designpatterns.patterns.chain.of.responsibility;

import com.example.designpatterns.patterns.builder.Computer;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        PaymentRequest paymentRequest = new PaymentRequest("12345678","1234", BigDecimal.valueOf(300),"PayPal");
        CardValidator cardValidator = new CardValidator();
        PinValidator pinValidator = new PinValidator();
        BalanceChecker balanceChecker = new BalanceChecker();
        PaymentMethodValidator paymentMethodValidator = new PaymentMethodValidator();
        cardValidator.setNext(pinValidator);
        pinValidator.setNext(balanceChecker);
        balanceChecker.setNext(paymentMethodValidator);

        cardValidator.handle(paymentRequest);
    }
}

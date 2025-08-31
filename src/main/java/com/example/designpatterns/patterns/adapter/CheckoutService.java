package com.example.designpatterns.patterns.adapter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@Setter
public class CheckoutService {
    PaymentGateway paymentGateway;

    public PaymentResult checkout(String cardNumber, BigDecimal amount) {
        //apply business logic then pass to the gateway
        PaymentResult res = paymentGateway.charge(cardNumber, amount);
        return res;
    }

    public RefundResult refund(String cardNumber, BigDecimal amount) {
        //apply business logic then pass to the gateway
        RefundResult res = paymentGateway.refund(cardNumber, amount);
        return res;
    }
}

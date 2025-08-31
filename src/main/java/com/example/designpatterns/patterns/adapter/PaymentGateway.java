package com.example.designpatterns.patterns.adapter;

import java.math.BigDecimal;

public interface PaymentGateway {
    PaymentResult charge(String cardNumber, BigDecimal amount);
    RefundResult refund(String cardNumber,BigDecimal amount);
}

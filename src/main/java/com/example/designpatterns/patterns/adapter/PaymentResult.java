package com.example.designpatterns.patterns.adapter;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class PaymentResult {
    String cardNumber;
    BigDecimal amount;
    Boolean isPayed;

}

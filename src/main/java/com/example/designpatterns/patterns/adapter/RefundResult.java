package com.example.designpatterns.patterns.adapter;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RefundResult {
    String cardNumber;
    BigDecimal amount;
    Boolean isRefunded;
}

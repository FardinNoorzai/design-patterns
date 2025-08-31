package com.example.designpatterns.patterns.chain.of.responsibility;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Slf4j
public class PaymentRequest {
    String card;
    String pin;
    BigDecimal amount;
    String paymentType;

}

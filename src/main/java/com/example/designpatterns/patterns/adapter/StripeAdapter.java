package com.example.designpatterns.patterns.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class StripeAdapter implements PaymentGateway {
    Logger logger = LoggerFactory.getLogger(StripeAdapter.class);
    @Override
    public PaymentResult charge(String cardNumber, BigDecimal amount) {
        logger.info("Charging Card Number using stripe client internal logic: {} amount {}", cardNumber,amount.toString());
        PaymentResult paymentResult = new PaymentResult();
        paymentResult.setCardNumber( cardNumber );
        paymentResult.setAmount( amount );
        paymentResult.setIsPayed(true);
        return paymentResult;
    }

    @Override
    public RefundResult refund(String cardNumber, BigDecimal amount) {
        logger.info("Refunding Card Number using stripe client internal logic: {} amount {}", cardNumber,amount.toString());
        RefundResult refundResult = new RefundResult();
        refundResult.setCardNumber( cardNumber );
        refundResult.setAmount( amount );
        refundResult.setIsRefunded(true);
        return refundResult;
    }
}

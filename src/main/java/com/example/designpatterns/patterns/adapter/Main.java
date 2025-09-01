package com.example.designpatterns.patterns.adapter;

import java.math.BigDecimal;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        PaymentGateway naqdpayGateway = new NaqdPayAdapter();
        PaymentGateway paypalGateway = new PaypalAdapter();
        PaymentGateway stripeGateway = new StripeAdapter();

        CheckoutService checkoutService = new CheckoutService(paypalGateway);
        checkoutService.checkout(UUID.randomUUID().toString(), BigDecimal.valueOf(100.56));

        checkoutService.setPaymentGateway(stripeGateway);
        checkoutService.checkout(UUID.randomUUID().toString(), BigDecimal.valueOf(100.56));

        checkoutService.setPaymentGateway(naqdpayGateway);
        checkoutService.refund(UUID.randomUUID().toString(), BigDecimal.valueOf(100.56));
    }
}

package com.example.designpatterns.patterns.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class CreditCheck {
    public boolean checkCredit(String customer) {
        log.info("Checking credit score for {}", customer);
        return true;
    }
}
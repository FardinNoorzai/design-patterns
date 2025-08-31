package com.example.designpatterns.patterns.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class IncomeVerification {
    public boolean verifyIncome(String customer) {
        log.info("Verifying income for {}", customer);
        return true;
    }
}
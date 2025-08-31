package com.example.designpatterns.patterns.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class LoanApproval {
    public boolean approveLoan(String customer, boolean creditOk, boolean incomeOk) {
        boolean approved = creditOk && incomeOk;
        log.info("Loan approval for {}: {}", customer, approved ? "Approved" : "Rejected");
        return approved;
    }
}
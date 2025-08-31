package com.example.designpatterns.patterns.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoanFacade {
    private CreditCheck creditCheck;
    private IncomeVerification incomeVerification;
    private LoanApproval loanApproval;
    private NotificationService notificationService;

    public LoanFacade() {
        this.creditCheck = new CreditCheck();
        this.incomeVerification = new IncomeVerification();
        this.loanApproval = new LoanApproval();
        this.notificationService = new NotificationService();
    }

    public void applyForLoan(String customer) {
        log.info("Starting loan application for {}", customer);
        boolean creditOk = creditCheck.checkCredit(customer);
        boolean incomeOk = incomeVerification.verifyIncome(customer);
        boolean approved = loanApproval.approveLoan(customer, creditOk, incomeOk);
        notificationService.sendNotification(customer, approved);
        log.info("Loan process completed for {}", customer);
    }
}

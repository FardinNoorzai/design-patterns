package com.example.designpatterns.patterns.strategy;

public class CommissionService {
    CommissionStrategy commissionStrategy;
    public CommissionService(CommissionStrategy commissionStrategy) {
        this.commissionStrategy = commissionStrategy;
    }

    public void setCommissionStrategy(CommissionStrategy commissionStrategy) {
        this.commissionStrategy = commissionStrategy;
    }

    public void calculateCommission(CommissionStrategy commissionStrategy) {
        //Other Logic
        setCommissionStrategy(commissionStrategy);
        commissionStrategy.calculateCommission();
    }
}

package com.example.designpatterns.patterns.strategy;

import com.example.designpatterns.patterns.flyweight.CharacterFactory;
import com.example.designpatterns.patterns.flyweight.Flyweight;

public class Main {
    public static void main(String[] args) {
        CommissionStrategy commissionStrategy1 = new CrossProvinceStrategy();
        CommissionStrategy commissionStrategy2 = new VipPartnerStrategy();

        CommissionService commissionService = new CommissionService(commissionStrategy1);
        commissionService.calculateCommission(commissionStrategy2);
        commissionService.calculateCommission(commissionStrategy1);

    }
}

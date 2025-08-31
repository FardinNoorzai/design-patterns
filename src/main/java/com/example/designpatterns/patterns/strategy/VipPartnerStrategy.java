package com.example.designpatterns.patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VipPartnerStrategy implements CommissionStrategy{
    Logger logger = LoggerFactory.getLogger(VipPartnerStrategy.class);
    @Override
    public void calculateCommission() {
        logger.info("Calculating commission with VIP partner Strategy");
    }
}

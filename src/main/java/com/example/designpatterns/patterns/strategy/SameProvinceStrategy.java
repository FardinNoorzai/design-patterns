package com.example.designpatterns.patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SameProvinceStrategy implements CommissionStrategy{
    Logger logger = LoggerFactory.getLogger(SameProvinceStrategy.class);
    @Override
    public void calculateCommission() {
        logger.info("Calculating commission with same Province Strategy");
    }
}

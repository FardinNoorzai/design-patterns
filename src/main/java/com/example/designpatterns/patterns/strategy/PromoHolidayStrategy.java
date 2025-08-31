package com.example.designpatterns.patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PromoHolidayStrategy implements CommissionStrategy{
    Logger logger = LoggerFactory.getLogger(PromoHolidayStrategy.class);
    @Override
    public void calculateCommission() {
        logger.info("Calculating commission with Promo Holiday Strategy");
    }
}

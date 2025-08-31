package com.example.designpatterns.patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrossProvinceStrategy implements CommissionStrategy{
    Logger logger = LoggerFactory.getLogger(CrossProvinceStrategy.class);
    @Override
    public void calculateCommission() {
        logger.info("Calculating commission with Cross Province Strategy");
    }
}

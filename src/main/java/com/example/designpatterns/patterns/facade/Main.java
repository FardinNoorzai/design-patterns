package com.example.designpatterns.patterns.facade;

import com.example.designpatterns.patterns.decorator.*;

import java.util.Map;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        LoanFacade loanFacade = new LoanFacade();
        loanFacade.applyForLoan("Fardin");
    }
}

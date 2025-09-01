package com.example.designpatterns.patterns.prototype;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        BankAccount cloned = bankAccount.clone();
        cloned.getData().add("data4");
        cloned.setName("clonedName");
        log.info("real object: {}", bankAccount);
        log.info("cloned object: {}", cloned);
    }
}

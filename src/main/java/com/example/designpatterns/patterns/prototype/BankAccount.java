package com.example.designpatterns.patterns.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@Setter
@Getter
@ToString
public class BankAccount implements Cloneable<BankAccount> {

    String name;
    String accountNumber;
    List<String> data;
    public BankAccount()  {
        this.name = "Test Bank Account";
        this.accountNumber = "123456789";
        this.data = new ArrayList<>();
        data.add("data1");
        data.add("data2");
        data.add("data3");
        try {
            Thread.sleep(1000);
            //simulating heavy load
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



    @Override
    public BankAccount clone() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setName(this.name);
        bankAccount.setAccountNumber(this.accountNumber);
        //deep copy
        //mutable object should be copied deep not swallow otherwise a change to the clone will effect the other objects internal state
        bankAccount.setData(new ArrayList<>(this.data));
        return bankAccount;
    }
}

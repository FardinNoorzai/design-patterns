package com.example.designpatterns.patterns.composite;

import com.example.designpatterns.patterns.chain.of.responsibility.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Developer("Ali", "Backend");
        Employee employee2 = new Developer("Ahmad", "Frontend");
        Employee employee3 = new Designer("Shoaib", "Designer");
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        Employee employee4 = new Manager("Saeed", "Manager", employees);
        employee4.showDetails();
    }
}

package com.example.designpatterns.patterns.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class Manager implements Employee {
    String name;
    String position;
    List<Employee> employees = new ArrayList<>();
    @Override
    public void showDetails() {
        log.info("Manger Details: Name: {}, Position: {}", name, position);
        for(Employee employee : employees){
            employee.showDetails();
        }
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
}

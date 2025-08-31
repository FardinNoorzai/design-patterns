package com.example.designpatterns.patterns.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class Developer implements Employee {
    String name;
    String position;
    @Override
    public void showDetails() {
        log.info("Developer Details: Name: {}, Position: {}", name, position);
    }
}

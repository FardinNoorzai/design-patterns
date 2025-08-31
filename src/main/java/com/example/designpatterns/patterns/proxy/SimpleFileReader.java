package com.example.designpatterns.patterns.proxy;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
public class SimpleFileReader implements FileReader{
    @Override
    public void read() {
       log.info("Reading file from file system");
    }
}

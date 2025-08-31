package com.example.designpatterns.patterns.proxy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Slf4j
public class FileReaderProxy implements FileReader{
    FileReader fileReader;
    String password;


    @Override
    public void read() {
        if(password.equals("admin")){
            fileReader.read();
        }else{
            log.info("You do not have the access to read the file");
        }
    }
}

package com.example.designpatterns.patterns.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingletonExample {
    static Logger logger = LoggerFactory.getLogger(SingletonExample.class);

    public static SingletonExample instance;

    private SingletonExample() {
        logger.info("Initializing Singleton Example");
        if(instance != null) {
            throw new RuntimeException("You can not instantiate a singleton object");
        }
    }


    public static SingletonExample getInstance() {
        if(instance == null){
            synchronized (SingletonExample.class) {
                if(instance == null){
                    instance = new SingletonExample();
                }
            }
        }
        logger.info("Returning Singleton Example instance");
        return instance;
    }

    public void logHello(){
        logger.info("Hello from Singleton Example");
    }
}

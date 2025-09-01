package com.example.designpatterns.patterns.object.pool;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@ToString
@Slf4j
public class Connection implements AutoCloseable {
    ConnectionPool connectionPool;
    //this interface was implemented to make sure if the client did not call the release method the jvm automatically call the
    // close method, however, the method is only called when the client use the class with try with resource so the problem is not completely solved
    @Override
    public void close() throws Exception {
        connectionPool.release(this);
    }

    boolean inUse;

    public Connection(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
        inUse = false;
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        log.info("Connection was established");
    }

    public void execute(String query){
        log.info("Executing query: {}", query);
    }



}

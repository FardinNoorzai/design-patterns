package com.example.designpatterns.patterns.object.pool;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

@Slf4j
public class ConnectionPool {
//    private List<Connection> availableConnections = new ArrayList<>();
//    private List<Connection> pendingConnections = new ArrayList<>();
//    private int maxConnections;
//
//    public ConnectionPool(int maxConnections) {
//        this.maxConnections = maxConnections;
//        for(int i = 0; i < maxConnections; i++){
//            availableConnections.add(new Connection());
//        }
//    }
//    public synchronized Connection getConnection(){
//        if(availableConnections.isEmpty()){
//            log.warn("No available connections");
//            return null;
//        }
//        Connection connection = availableConnections.remove(0);
//        connection.setInUse(true);
//        pendingConnections.add(connection);
//        return connection;
//    }
//
//    public synchronized void releaseConnection(Connection connection){
//        connection.setInUse(false);
//        pendingConnections.remove(connection);
//        availableConnections.add(connection);
//    }

//this implementation works, but the synchronized methods are really heavy, and it's better to use concurrent collections provided by java

    private BlockingQueue<Connection> connectionPool = new LinkedBlockingQueue<>();
    private int poolSize;
    public ConnectionPool(int poolSize) {
        this.poolSize = poolSize;
        for(int i = 0; i < poolSize; i++){
            connectionPool.add(new Connection(this));
        }
    }

    public Connection getConnection() throws InterruptedException {
        return connectionPool.poll(5, TimeUnit.SECONDS);
    }
    public void release(Connection connection){
        connectionPool.offer(connection);
    }




}

package com.example.designpatterns.patterns.object.pool;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        ConnectionPool connectionPool = new ConnectionPool(10);
        Connection con = null;
        try{
            for(int i = 0; i < 10; i++){
                con= connectionPool.getConnection();
                con.execute("Select * from users");
                Connection finalCon = con;
                Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        connectionPool.release(finalCon);
                    }
                };
                new Thread(runnable).start();
            }

            log.info("All connections are being used waiting for one to get released to acquire them");
            Connection conn = connectionPool.getConnection();
            conn.execute("Select * from users");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

package com.edu.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: base-java
 * @description:
 * @author: lihangyu
 * @create: 2020-11-25 16:29
 */
public class TestLock {
    public static void main(String[] args) {
        buyticket buyticket = new buyticket();
        new Thread(buyticket).start();
        new Thread(buyticket).start();
        new Thread(buyticket).start();
    }
}
class buyticket implements Runnable{
    private int ticket = 10;
    //定义lock锁
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while(true){
            try {
                lock.lock();

                if(ticket<=0){
                    break;
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(ticket--);
            }finally {
                //解锁
                lock.unlock();
            }

        }
    }
}
package com.edu.thread;

/**
 * @program: base-java
 * @description:
 * @author: lihangyu
 * @create: 2020-11-25 14:42
 */
public class TestJoin {
    public static void main(String[] args) throws InterruptedException {
        Runnable thread = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("插队线程！！");
                }
            }
        };
        Thread thread1 = new Thread(thread);
        thread1.start();
        for (int i = 0; i < 1000; i++) {
            if(i==10){
                thread1.join();
            }
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}

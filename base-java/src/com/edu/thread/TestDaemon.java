package com.edu.thread;

/**
 * @program: base-java
 * @description:
 * @author: lihangyu
 * @create: 2020-11-25 15:20
 */
public class TestDaemon {
    public static void main(String[] args) {
        Thread god = new Thread(()->{
            while (true){
                System.out.println("上帝一直守护你");
            }

        });
        god.setDaemon(true);//true为守护线程
        Thread user = new Thread(()->{
            for (int i = 0; i < 200000; i++) {
                System.out.println("Hi");
            }
           System.out.println("bye");
        });
        god.start();
        user.start();
    }


}

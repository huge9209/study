package com.edu.runnable;

/**
 * @program: base-java
 * @description: 如何创建线程
 * @author: lihangyu
 * @create: 2020-11-25 10:10
 */
public class CreactThread {
    public static void main(String[] args) {
        //不建议使用子类继承Thread的方法：oop单继承的局限性
        Thread thread = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 500; i++) {
                    System.out.println("线程一1111111111"+i);
                }
            }
        };
        thread.start();

        //推荐使用：避免单继承的局限性，灵活方便，方便同一个对象想被多个线程使用
        Thread1 thread1 = new Thread1();
        Thread1 thread2 = new Thread1();
        new Thread(thread1).start();

        new Thread(()->System.out.println()).start();
    }
}
class Thread1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("线程二-"+i);
        }
    }
}
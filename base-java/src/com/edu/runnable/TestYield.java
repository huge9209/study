package com.edu.runnable;

/**
 * @program: base-java
 * @description:
 * @author: lihangyu
 * @create: 2020-11-25 14:36
 */
public class TestYield {
    public static void main(String[] args) {
        myyield myyield = new myyield();
        new Thread(myyield,"线程1").start();
        new Thread(myyield,"线程2").start();
    }
}
class myyield implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始执行");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"线程停止执行");
    }
}
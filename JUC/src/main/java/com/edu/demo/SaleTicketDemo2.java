package com.edu.demo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: JUC
 * @description:
 * @author: lihangyu
 * @create: 2020-11-26 10:57
 */
public class SaleTicketDemo2 {
    public static void main(String[] args) {
        // 并发： 多线程操作同一个资源类
        Ticket2 ticket = new Ticket2();

        //@FunctionalInterface 函数式接口 jdk1.8 lambda表达式
        new Thread(()->{
            for (int i = 0; i < 60; i++) ticket.sale();
        },"A").start();
        new Thread(()->{
            for (int i = 0; i < 60; i++) ticket.sale();
        },"B").start();
        new Thread(()->{
            for (int i = 0; i < 60; i++) ticket.sale();
        },"C").start();
    }
}

//资源类 OOP
class  Ticket2{
    //属性 方法
    private int number = 50;

    Lock lock = new ReentrantLock();


    public  void sale(){

        lock.lock();
        try {
            if(number>0){
                System.out.println(Thread.currentThread().getName()+"卖出了"+(number--)+"票 ， 剩余： "+number);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }


    }

}
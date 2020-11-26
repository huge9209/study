package com.edu.demo;

/**
 * @program: JUC
 * @description:
 * @author: lihangyu
 * @create: 2020-11-26 10:57
 */
public class SaleTicketDemo {
    public static void main(String[] args) {
        // 并发： 多线程操作同一个资源类
        Ticket ticket = new Ticket();

        //@FunctionalInterface 函数式接口 jdk1.8 lambda表达式
        new Thread(()->{
            for (int i = 0; i < 60; i++) {
                ticket.sale();
            }
        },"A").start();
        new Thread(()->{
            for (int i = 0; i < 60; i++) {
                ticket.sale();
            }
        },"B").start();
        new Thread(()->{
            for (int i = 0; i < 60; i++) {
                ticket.sale();
            }
        },"C").start();
    }
}
//资源类 OOP
class  Ticket{
    //属性 方法
    private int number = 50;

    //synchronized 队列和锁
    public synchronized void sale(){
        if(number>0){
            System.out.println(Thread.currentThread().getName()+"卖出了"+(number--)+"票 ， 剩余： "+number);
        }
    }

    //锁 对象
}
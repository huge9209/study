package com.edu.PC;

/**
 * @program: JUC
 * @description:  等待  业务   通知
 * @author: lihangyu
 * @create: 2020-11-26 11:50
 */
public class Buffer {
    private int num = 0;

    public  synchronized  void add() throws InterruptedException {
        while (num!=0){
            //等待
            this.wait();
        }
        num++;
        System.out.println(Thread.currentThread().getName()+"---"+num);
        //通知其他线程
        this.notifyAll();
    }

    public  synchronized  void sub() throws InterruptedException {
        /**
         * 就是用if判断的话，唤醒后线程会从wait之后的代码开始运行，但是不会重新判断if条件，
         * 直接继续运行if代码块之后的代码，而如果使用while的话，
         * 也会从wait之后的代码运行，但是唤醒后会重新判断循环条件，
         * 如果不成立再执行while代码块之后的代码块，成立的话继续wait
         */
//        if(num==0){
//            //等待
//            this.wait();
//        }
        //用 while 防止虚假唤醒的情况
        while (num==0){
            //等待
            this.wait();
        }
        num--;
        System.out.println(Thread.currentThread().getName()+"---"+num);
        //通知其他线程
        this.notifyAll();
    }
}

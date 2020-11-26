package com.edu.thread.PC;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: base-java
 * @description: 生产者消费者 管程法
 * @author: lihangyu
 * @create: 2020-11-25 16:48
 */
public class TestPC {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        new Product(buffer).start();
        new Consumer(buffer).start();
    }
}
class Product extends  Thread{//生产者只管生产
    private  Buffer buffer ;
    Product(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("生产了 第"+i+"只鸡------");
            buffer.push(i);
        }
    }
}
class Consumer extends  Thread{//消费者只管消费
    private  Buffer buffer ;
    Consumer(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("消费了 "+buffer.pop()+" 这只鸡");

        }
    }
}
class Buffer{
    private List<String> list = new ArrayList<>();
    private int count = 0;
    //生产者生产产品
    public synchronized void push(int i){
        //如果容器满了就通知消费者
        if(count==10){
            //生产者等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果容器没有满就生产产品
        list.add("产品"+i);
        count++;
        this.notifyAll();
    }

    //消费者消费商品
    public synchronized String pop(){
        if(count == 0){
            //生产者生产，消费者等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String s = list.remove(count-1);
        count--;
        this.notifyAll();
        return s;

    }
}

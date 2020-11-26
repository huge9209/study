package com.edu.PC;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: JUC
 * @description: JUC版 生产者 消费者
 * @author: lihangyu
 * @create: 2020-11-26 14:21
 */
public class Buffer2 {

    private int num = 0;
    final Lock lock = new ReentrantLock();
    final Condition condition = lock.newCondition();


    public    void add() throws InterruptedException {
        lock.lock();
        try {
            while (num!=0){
                //等待
                condition.await();
            }
            num++;
            System.out.println(Thread.currentThread().getName()+"---"+num);
            //通知其他线程
            condition.signalAll();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }



    }

    public    void sub() throws InterruptedException {

        lock.lock();
        try {
            while (num==0){
                //等待
                condition.await();
            }
            num--;
            System.out.println(Thread.currentThread().getName()+"---"+num);
            //通知其他线程
            condition.signalAll();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }


    }
}

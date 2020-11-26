package com.edu.PC;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: JUC
 * @description: 精准的通知 唤醒
 * @author: lihangyu
 * @create: 2020-11-26 14:41
 */
public class Buffer3 {
    public static void main(String[] args) {
        Data data = new Data();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                data.printA();
            }
        }).start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                data.printB();
            }
        }).start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                data.printC();
            }
        }).start();
    }
}
class Data{
    private int num = 1;
    Lock lock = new ReentrantLock();
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();


    public void printA(){
        lock.lock();
        try {
            while (num!=1){
                condition1.await();
            }
            num=2;
            System.out.println(Thread.currentThread().getName()+"--AAA");
            condition2.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void printB(){
        lock.lock();
        try {
            while (num!=2){
                condition2.await();
            }
            num=3;
            System.out.println(Thread.currentThread().getName()+"--BBB");
            condition3.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void printC(){
        lock.lock();
        try {
            while (num!=3){
                condition3.await();
            }
            num=1;
            System.out.println(Thread.currentThread().getName()+"--CCC");
            condition1.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
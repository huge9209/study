package com.edu.help;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @program: JUC
 * @description:
 * @author: lihangyu
 * @create: 2020-11-30 14:16
 */
public class SemaphoreTest {
    public static void main(String[] args) {
        //线程数量 停车位
        Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i < 6; i++) {
            new Thread(()->{
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName()+"抢到车位");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println(Thread.currentThread().getName()+"离开车位");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                }
            },"线程--"+i).start();
        }
    }
}

package com.edu.help;

import java.util.concurrent.CountDownLatch;

/**
 * @program: JUC
 * @description:
 * @author: lihangyu
 * @create: 2020-11-30 11:49
 */
public class add {
    public static void main(String[] args) throws InterruptedException {
        //减法计数器  总数是6 必须要执行任务的时候，再使用
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for (int i = 0; i <= 6; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+" gogo ");
                countDownLatch.countDown();//数量减一
            },String.valueOf(i)).start();
        }
        countDownLatch.await();// 等待计数器归零，然后再向下执行
        System.out.println("close door");
    }
}

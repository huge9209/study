package com.edu.thread.pool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: base-java
 * @description: 线程池
 * @author: lihangyu
 * @create: 2020-11-25 17:57
 */
public class ThreadPool {
    public static void main(String[] args) {
        /**
         * newCachedThreadPool创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
         * newFixedThreadPool 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
         * newScheduledThreadPool 创建一个定长线程池，支持定时及周期性任务执行。
         * newSingleThreadExecutor 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。
         */
        ExecutorService service = Executors.newFixedThreadPool(5);
        Runnable thread  = ()->{
            System.out.println(Thread.currentThread().getName());
        } ;
        Thread thread1 = new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"--");
        });
        service.execute(thread);
        service.execute(thread1);
        service.execute(thread);
        service.execute(thread);
        service.submit(thread);

        //execute 没有返回值  submit有返回值
        service.shutdown();
        
        
        

    }
}

package com.edu.pool;

import java.security.AccessController;
import java.util.concurrent.*;

/**
 * @program: JUC
 * @description:  Executors 工具类 三大方法 七大参数 四大拒绝策略
 *                           使用了线程
 * @author: lihangyu
 * @create: 2020-11-30 15:52
 */
public class Demo1 {
    public static void main(String[] args) {
       //ExecutorService service = Executors.newSingleThreadExecutor();//单个线程
       // ExecutorService service = Executors.newFixedThreadPool(5);//固定线程池的大小
       // ExecutorService service = Executors.newCachedThreadPool();//可伸缩的
        ExecutorService service = new ThreadPoolExecutor(2,5,3,TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());//银行满了，还有人进来，不处理这个热播的，抛出异常
                                    //.CallerRunsPolicy()哪来的 去哪里
                                    //.DiscardPolicy() 队列满了 丢掉任务 不会抛出异常
                                    //.DiscardOldestPolicy() 尝试去竞争第一个线程
        try {
            for (int i = 1; i <= 5; i++) {
                service.execute(()->{
                    System.out.println(Thread.currentThread().getName()+" ok");
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            service.shutdown();
        }
    }
    public void ThreadPoolExecutor(int corePoolSize,//核心线程池大小
                              int maximumPoolSize,//最大核心线程大小
                              long keepAliveTime,//超时了没有人调用就会释放
                              TimeUnit unit,//超时单位
                              BlockingQueue<Runnable> workQueue,//阻塞队列
                              ThreadFactory threadFactory,//线程工厂，创建线程的，一般不用动
                              RejectedExecutionHandler handler) {//拒绝策略

    }
}

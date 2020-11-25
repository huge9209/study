package com.edu.thread;

import java.util.concurrent.*;

/**
 * @program: base-java
 * @description: 继承Callable线程
 * @author: lihangyu
 * @create: 2020-11-25 10:46
 */
public class CallableThread implements Callable<Boolean> {
    private String name;

    public CallableThread(String name) {
        this.name = name;
    }

    @Override
    public Boolean call() throws Exception {
        for (int i = 0; i < 500; i++) {
            System.out.println(Thread.currentThread().getName()+"----"+i);
        }
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableThread callableThread = new CallableThread("call线程1");
        CallableThread callableThread1 = new CallableThread("call线程22");
        CallableThread callableThread2 = new CallableThread("call线程333");

        //创建执行服务
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        //提交执行
        Future<Boolean> booleanFuture = executorService.submit(callableThread);
        Future<Boolean> booleanFuture1 = executorService.submit(callableThread1);
        Future<Boolean> booleanFuture2 = executorService.submit(callableThread2);

        //获取结果
        Boolean aBoolean = booleanFuture.get();
        Boolean aBoolean1 = booleanFuture1.get();
        Boolean aBoolean2 = booleanFuture2.get();

        //关闭服务
        executorService.shutdown();
    }
}

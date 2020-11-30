package com.edu.callable;

import java.util.concurrent.*;

/**
 * @program: JUC
 * @description:
 * @author: lihangyu
 * @create: 2020-11-30 10:12
 */
public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyThread myThread = new MyThread();
        FutureTask futureTask = new FutureTask(myThread);
        //futureTask 是runable的实现类
        new Thread(futureTask).start();
        String s = (String) futureTask.get();
        System.out.println(s);


        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(futureTask);
        executorService.shutdown();
    }
}
class MyThread implements Callable<String> {

    @Override
    public String call() {
        return "wwww";
    }
}

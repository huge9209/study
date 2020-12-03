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
        new Thread(futureTask,"A").start();
        new Thread(futureTask,"B").start();
        String s = (String) futureTask.get(); //这个get方法可能会产生阻塞！把他放在最后
        System.out.println(s);


//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        executorService.submit(futureTask);
//        executorService.shutdown();
    }
}
class MyThread implements Callable<String> {

    @Override
    public String call() {
        System.out.println("call");// 只打印一个call  因为有缓存
        return "wwww";
    }
}

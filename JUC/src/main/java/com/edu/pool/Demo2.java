package com.edu.pool;

import java.util.concurrent.*;

/**
 * @program: JUC
 * @description:
 * @author: lihangyu
 * @create: 2020-11-30 16:33
 */
public class Demo2 {
    public static void main(String[] args) {
        ExecutorService service = new ThreadPoolExecutor(5,10,3, TimeUnit.SECONDS,new LinkedBlockingDeque<>(5), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        for (int i = 1; i <= 20; i++) {
            final int temp = i;
            FutureTask future = new FutureTask(()->{
                System.out.println(Thread.currentThread().getName()+"--"+temp);
                return temp;
            });

            service.submit(future);
//            try {
//                System.out.println("result---"+future.get());//等结果出来  会阻塞
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } catch (ExecutionException e) {
//                e.printStackTrace();
//            }
        }
        service.shutdown();

    }
}

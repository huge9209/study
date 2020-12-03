package com.edu.help;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @program: JUC
 * @description:
 * @author: lihangyu
 * @create: 2020-11-30 12:01
 */
public class add {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7,()->{
           System.out.println("收集到7！");
        });
        for (int i = 0; i < 8; i++) {
            final int  temp = i;
            new Thread(()->{

                try {
                    cyclicBarrier.await(); //等待
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println("执行"+temp);
            }).start();
        }
    }
}

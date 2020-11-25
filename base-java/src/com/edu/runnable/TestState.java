package com.edu.runnable;

/**
 * @program: base-java
 * @description: 线程状态
 * @author: lihangyu
 * @create: 2020-11-25 15:03
 */
public class TestState {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("///////");
        });
        //观察状态
        Thread.State state = thread.getState();
        System.out.println(state);//NEW

        //观察启动后
        thread.start();
        state = thread.getState();
        System.out.println(state);//RUN

        while (thread.getState()!=Thread.State.TERMINATED){//只要线程不终止，就一直在输出
            Thread.sleep(100);
            state = thread.getState();
            System.out.println(state);
        }
    }
}

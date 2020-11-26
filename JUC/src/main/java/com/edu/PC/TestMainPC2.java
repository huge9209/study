package com.edu.PC;

/**
 * @program: JUC
 * @description:
 * @author: lihangyu
 * @create: 2020-11-26 14:28
 */
public class TestMainPC2 {
    public static void main(String[] args) {
        Buffer2 buffer = new Buffer2();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    buffer.add();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    buffer.add();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    buffer.sub();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    buffer.sub();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}

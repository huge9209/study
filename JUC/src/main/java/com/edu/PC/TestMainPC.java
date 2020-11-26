package com.edu.PC;

/**
 * @program: JUC
 * @description:
 * @author: lihangyu
 * @create: 2020-11-26 11:57
 */
public class TestMainPC {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

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

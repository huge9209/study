package com.edu.demo;

/**
 * @program: JUC
 * @description:
 * @author: lihangyu
 * @create: 2020-11-26 10:47
 */
public class TestMain {
    public static void main(String[] args) {
        //获取cpu的核数
        // cpu 密集型
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}

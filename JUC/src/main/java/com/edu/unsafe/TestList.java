package com.edu.unsafe;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;


/**
 * @program: JUC
 * @description:
 * @author: lihangyu
 * @create: 2020-11-26 16:20
 */
public class TestList {
    public static void main(String[] args) {
        //java.util.ConcurrentModificationException 并发修改异常
        /**
         * 解决方案：
         * 1，List<String> strings = new Vector<>();
         * 2.List<String> strings = Collections.synchronizedList(new ArrayList<>());
         * 3.List<String> strings = new CopyOnWriteArrayList<>();
         */
         //
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0,5));
                System.out.println(list);
            },"线程-"+i).start();
        }
    }
}

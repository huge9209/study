package com.edu.unsafe;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @program: JUC
 * @description:
 * @author: lihangyu
 * @create: 2020-11-26 17:14
 */
public class TestSet {
    public static void main(String[] args) {
        //java.util.ConcurrentModificationException

        /**
         *
         */

        //Set<String> set = new HashSet<>();
        Set<String> set = new CopyOnWriteArraySet<String>();
        for (int i = 1; i <= 30; i++) {
            new Thread(()->{
                set.add(UUID.randomUUID().toString().substring(0,5));
                System.out.println(set);
            },"线程-"+i).start();
        }

    }
}

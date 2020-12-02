package com.edu.refrect;

import java.lang.reflect.Field;

/**
 * @program: base-java
 * @description:
 * @author: lihangyu
 * @create: 2020-12-02 18:16
 */
public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1,主动调用
        //Son  son = new Son();
        //反射也会产生主动引用
        Class.forName("com.edu.refrect.Son");
    }
}
class Father{
    static {
        System.out.println("加载父类类");
    }
}
class Son extends Father {
    static {
        System.out.println("加载子类");
    }
}
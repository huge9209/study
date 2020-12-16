package com.edu.oop;

/**
 * @program: base-java
 * @description:
 * @author: lihangyu
 * @create: 2020-11-23 11:07
 */
public class B extends A{
    public String name="B";
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void method1() {
        System.out.println("B执行method1");
    }

    public static void method2(){
        System.out.println("B执行method2");
    }
}

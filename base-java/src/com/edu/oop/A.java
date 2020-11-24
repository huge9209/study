package com.edu.oop;

/**
 * @program: base-java
 * @description:
 * @author: lihangyu
 * @create: 2020-11-23 11:06
 */
public class A {
    public String name = "A";
    public void method1(){
        System.out.println("A执行method1");
    }

    public void method2(){

        System.out.println("A执行method2");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        A a = new B();
        a.method1();//方法看右边
        a.method2();
        System.out.println(a.name);//属性看左边
    }
}


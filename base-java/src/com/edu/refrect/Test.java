package com.edu.refrect;

/**
 * @program: base-java
 * @description:
 * @author: lihangyu
 * @create: 2020-12-02 17:48
 */
public class Test {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.m);
    }
}
class A{
    static {
        System.out.println("执行静态代码块！");
        m=300;
    }
    static int m = 100;
    public A(){
        System.out.println("执行构造方法！");
    }
}
//执行的逻辑： 类先加载到方法区 ，确保加载的类信息符合JVM规范，没有安全方面的问题  ->验证
//   准备：         正式为类变量(static)分配内存并设置类变量默认初始值，这些内存都将在方法区中进行分配（静态变量都在方法方法区）
//解析：  虚拟机常量池内的符号引用（常量名） 替换为直接引用（地址）的过程
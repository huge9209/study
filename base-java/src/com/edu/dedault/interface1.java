package com.edu.dedault;

/**
 * 1.8之后，接口中可以添加使用default或者static修饰的方法
 * 两者的区别  以及 调用两个接口有同样的方法被default 修饰时 类里面要重写 这个方法 否则报错
 */
public interface interface1 {
    default void defaulthello(){
        System.out.println("defaulthello!");
    }
    static void statichello(){
        System.out.println("statichello!");
    }
}

class TestClass implements interface1,interface2{

    @Override
    public void defaulthello() {
        System.out.println("重写方法defaulthello");
    }
}
class TestDefault{
    public static void main(String[] args) {
        interface1.statichello();
        new TestClass().defaulthello();
    }
}

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

    public static void method2(){

        System.out.println("A执行method2");
    }
    public void method3(){

        System.out.println("A执行method3");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        /**
         * 首先了解变量Fu到底是什么，把这句话分两段：Fu f;这是声明一个变量f为Fu这个类，知道了f肯定为Fu类。
         * 然后我们f = new Zi();中创建一个子类对象赋值给了f，结果是什么？结果是拥有了被Zi类函数覆盖后的Fu类对象f。
         *
         * 也就是说只有子类函数覆盖了父类函数这一个变化，但是肯定是Fu这个类，也就是说f不可能变成其他比如Zi这个类等等。
         * 所以f代表的是函数被复写后(多态的意义)的一个Fu类，而父类原有的成员变量没有任何变化。即成员变量编译和运行都看Fu。
         *
         * 但是对于f的Fu类函数被复写了，非静态方法编译看Fu，运行看Zi。
         *
         * 对于静态方法：编译和运行都看Fu。因为对静态变量而言，Fu类的所有函数都跟随Fu类加载而加载了。
         * 也就是Fu类的函数是先于对象的创建之前就已经存在了，无法被后出现的Zi类对象所复写，所以没有发生复写现象。
         */
        A a = new B();
        a.method1();//方法看右边
        a.method2();//静态方法
        a.method3();
        System.out.println(a.name);//属性看左边
    }
}


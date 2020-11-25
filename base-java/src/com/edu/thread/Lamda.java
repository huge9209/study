package com.edu.thread;

/**
 * @program: base-java
 * @description: lamda表达式  一步步简化
 * @author: lihangyu
 * @create: 2020-11-25 11:21
 */
public class Lamda {
    //3,静态内部类
    static class C implements A{
        public void test(){
            System.out.println("测试C方法");
        }
    }

    public static void main(String[] args) {
        A a = new B();
        a.test();

        A a1 = new C();
        a1.test();

        //4,局部类部类
        class D implements A{
            public void test(){
                System.out.println("测试D方法");
            }
        }

        A a2 = new D();
        a2.test();

        //5,匿名类部类 没有类的名称 必须借助接口或者父类
        A a3 = new A() {
            @Override
            public void test() {
                System.out.println("测试匿名类部类");
            }
        };
        a3.test();

        //6.lamda表达式简化
        a3 = (/*  参数 */) /*左边也可以去掉括号*/->{
            System.out.println("测试lamda表达式");
        };
        a3.test();
    }
}

//1,定义一个函数式接口
interface A{
    void test();
}
//2,实现类
class B implements A{
    public void test(){
        System.out.println("测试B方法");
    }
}
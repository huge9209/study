package com.edu.thread;

/**
 * @program: base-java
 * @description: 死锁：四个条件  互斥条件 请求与保持条件 不可剥夺条件 循环等待条件
 * @author: lihangyu
 * @create: 2020-11-25 16:16
 */
public class DeadLock {
    public static void main(String[] args) {
        Makeup makeup = new Makeup(0,"钟哈哈");
        Makeup makeup1 = new Makeup(1,"钟啦啦");
        new Thread(makeup).start();
        new Thread(makeup1).start();

    }
}
//口红
class Lipstick{

}
//镜子
class Mirror{

}
class Makeup implements Runnable{
    static Lipstick lipstick = new Lipstick();
    static  Mirror mirror = new Mirror();
    int choose ;//选择
    String name ;//什么人

    public Makeup(int choose, String name) {
        this.choose = choose;
        this.name = name;
    }

    @Override
    public void run() {
        //化妆
        if(choose==0){
            synchronized (lipstick){
                System.out.println(name+"获得口红的锁");
            }
            synchronized (mirror){
                System.out.println(name+"获得镜子的锁");
            }
        }else {
            synchronized (mirror){
                System.out.println(name+"获得镜子的锁");
            }
            synchronized (lipstick){
                System.out.println(name+"获得口红的锁");
            }
        }
        /**
         *
         * 死锁代码
         * if(choose==0){
         *             synchronized (lipstick){
         *                 System.out.println(name+"获得口红的锁");
         *                 synchronized (mirror){
         *                     System.out.println(name+"获得镜子的锁");
         *                 }
         *             }
         *         }else {
         *             synchronized (mirror){
         *                 System.out.println(name+"获得镜子的锁");
         *                 synchronized (lipstick){
         *                     System.out.println(name+"获得口红的锁");
         *                 }
         *             }
         *         }
         */
    }
}
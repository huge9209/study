package com.edu.thread;

/**
 * @program: base-java
 * @description:
 * @author: lihangyu
 * @create: 2020-11-25 10:36
 */
public class TicketThread implements Runnable{


    private int ticket = 10;
    boolean flag = true;

    @Override
    public  void run() {
        while (flag){
            try {
                buy();
                Thread.sleep(100);//注意sloop不会释放锁
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //synchronized 同步方法 锁的时this
    // synchronized块  synchronized(锁的对象){}  锁的对象就是变化的量

    public synchronized void buy() throws InterruptedException {
        if(ticket<=0){
            flag = false;
            return;
        }


        System.out.println(Thread.currentThread().getName()+"拿到了第"+ticket--+"张票！");
    }


}
class Main {
    public static void main(String[] args) {
        TicketThread ticketThread = new TicketThread();

        new Thread(ticketThread,"钟1").start();
        new Thread(ticketThread,"钟22").start();
        new Thread(ticketThread,"钟333").start();
    }
}
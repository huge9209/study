package com.edu.runnable;

/**
 * @program: base-java
 * @description:
 * @author: lihangyu
 * @create: 2020-11-25 10:36
 */
public class TicketThread implements Runnable{


    private int ticket = 500;

    @Override
    public synchronized void run() {
        while (true){
            if(ticket<=0){
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"拿到了第"+ticket+"张票！");
            ticket--;
        }
    }

    public static void main(String[] args) {
        TicketThread ticketThread = new TicketThread();

        new Thread(ticketThread,"钟1").start();
        new Thread(ticketThread,"钟22").start();
        new Thread(ticketThread,"钟333").start();
    }
}

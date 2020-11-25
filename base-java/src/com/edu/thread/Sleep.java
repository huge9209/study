package com.edu.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: base-java
 * @description:
 * @author: lihangyu
 * @create: 2020-11-25 14:26
 */
public class Sleep {
    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis());
        try {
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date(System.currentTimeMillis())));
            Sleep.daojishi(10);
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date(System.currentTimeMillis())));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void daojishi(int num) throws InterruptedException {

        while(true){
            if(num<=0){
                break;
            }
            Thread.sleep(1000);
            System.out.println(num--);
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date(System.currentTimeMillis())));
        }

    }
}

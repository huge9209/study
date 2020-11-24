package com.edu.API;

/**
 * @program: base-java
 * @description:
 * @author: lihangyu
 * @create: 2020-11-24 17:36
 */
public class StringMain {
    public static void main(String[] args) {
        String a= "1234567890";
        a.length();
        int b = a.getBytes().length;
        System.out.println(b);
        StringBuffer c = new StringBuffer();//可变字符序列，线程安全
        StringBuilder d = new StringBuilder();//可变字符序列，线程不安全

        Integer s1 = 127, s2 = 127, t1 = 128, t2 = 128;
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(t1 == t2);
        System.out.println(t1.equals(t2));
        System.out.println(t1.intValue() == t2.intValue());

    }
}

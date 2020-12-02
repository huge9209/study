package com.edu.refrect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @program: base-java
 * @description:
 * @author: lihangyu
 * @create: 2020-12-02 18:29
 */
public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class aClass = Class.forName("com.edu.refrect.User");//ClassNotFoundException
        Field[] fields = aClass.getFields();//只能找到public属性
        for (Field field:
             fields) {
            System.out.println(field);//public java.lang.String com.edu.refrect.User.age
        }
        System.out.println("---------------");
        fields = aClass.getDeclaredFields();//找到全部的属性
        for (Field field:
                fields) {
            System.out.println(field);//public java.lang.String com.edu.refrect.User.age
        }
        System.out.println("---------------");
        //Field field = aClass.getField("name");//只获取public的属性
        Field field = aClass.getDeclaredField("name");
        System.out.println(field);

        //获取方法
        System.out.println("---------------");
        Method[] methods = aClass.getMethods();//获取本类的和父类的public方法
        for (Method method:
             methods) {
            System.out.println(method);
        }
        System.out.println("---------------");
        methods = aClass.getDeclaredMethods();//获得本类的所有方法
        for (Method method:
                methods) {
            System.out.println(method);
        }
        System.out.println("---------------");
        Method method = aClass.getDeclaredMethod("getName",null/*参数*/);//NoSuchMethodException
        Method method1 = aClass.getDeclaredMethod("setName", String.class);
        System.out.println(method);
        System.out.println(method1);

        //获得指定的构造器
        System.out.println("---------------");
        Constructor[] constructors = aClass.getConstructors();
        for (Constructor constructor:
             constructors) {
            System.out.println(constructor);
        }
        System.out.println("---------------");
        constructors = aClass.getDeclaredConstructors();
        for (Constructor constructor:
                constructors) {
            System.out.println(constructor);
        }
        //获取指定的构造器
        System.out.println("---------------");
        Constructor constructor = aClass.getDeclaredConstructor(String.class,String.class);
        System.out.println(constructor);
    }
}

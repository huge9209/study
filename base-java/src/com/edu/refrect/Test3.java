package com.edu.refrect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @program: base-java
 * @description:
 * @author: lihangyu
 * @create: 2020-12-02 19:45
 */
public class Test3 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class aClass = User.class;
        User user = (User) aClass.newInstance();//本质调用了类得无参构造器
        System.out.println(user);

        System.out.println("---------------");
        Constructor constructor = aClass.getDeclaredConstructor(String.class,String.class);
        constructor.setAccessible(true);
        User user1 = (User) constructor.newInstance("pianpian","18");
        System.out.println(user1);

        System.out.println("---------------");
        User user2 = (User) aClass.newInstance();
        Method method = aClass.getDeclaredMethod("setName",String.class);
        method.setAccessible(true);
        method.invoke(user2,"painpian1");
        System.out.println(user2);

        System.out.println("---------------");
        User user3 = (User) aClass.newInstance();
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(user3,"pianpian2");
        System.out.println(user3);
    }
}

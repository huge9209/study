package com.edu.proxy.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @program: study-spring
 * @description:
 * @author: lihangyu
 * @create: 2020-12-21 11:00
 */
public class Log  {

    public void before()  {
        System.out.println("方法执行前的方法");
    }


    public void after()  {
        System.out.println("方法执行后的方法");
    }
}

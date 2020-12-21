package com.edu.proxy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;

/**
 * @program: study-spring
 * @description:
 * @author: lihangyu
 * @create: 2020-12-21 11:56
 */
@Configuration
@Aspect
public class LogAnno {


    @Before("execution(* com.edu.proxy.aop.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("==========方法执行前========");
    }

    @After("execution(* com.edu.proxy.aop.UserServiceImpl.*(..)))")
    public void after() {
        System.out.println("==========方法执行后========");
    }

    @AfterThrowing("execution(* com.edu.proxy.aop.UserServiceImpl.*(..)))")
    public void AfterThrowing() {
        System.out.println("==========方法异常后========");
    }

    @AfterReturning("execution(* com.edu.proxy.aop.UserServiceImpl.*(..)))")
    public void AfterReturning() {
        System.out.println("==========方法返回后========");
    }

    @Around("execution(* com.edu.proxy.aop.UserServiceImpl.*(..)))")
    public void around(ProceedingJoinPoint pjp)  {
        System.out.println("======环绕前========");
        try {
            Object proceed = pjp.proceed();
            System.out.println("===环绕返回===="+proceed+"========");
        } catch (Throwable throwable) {
            System.out.println("=======环绕异常========");
        }

        System.out.println("=======环绕后========");
    }

}

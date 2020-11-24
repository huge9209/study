package com.edu.Annotation;

import org.apache.commons.lang.StringUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @program: base-java
 * @description:
 * @author: lihangyu
 * @create: 2020-11-23 14:41
 */
@TestAnno("类上注解")
public class Demo {

    @TestAnno("方法上注解")
    public void test() {
        System.out.println("执行test方法");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Demo demo = new Demo();
        Class<?> cls = demo.getClass();
        TestAnno testAnno =  cls.getAnnotation(TestAnno.class);
        //如果获取为空，表示没有找到对于的注解
        System.out.println(testAnno.value()[0]);
        //获取方法对象
        Method m = cls.getMethod("test");
        TestAnno testAnno1 = m.getAnnotation(TestAnno.class);
        System.out.println(testAnno1.value()[0]);
    }
}

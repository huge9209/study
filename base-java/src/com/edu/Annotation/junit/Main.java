package com.edu.Annotation.junit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @program: base-java
 * @description:
 * @author: lihangyu
 * @create: 2020-11-23 19:34
 */
public class Main {
    public static void main(String[] args) {
        DemoTest demoTest = new DemoTest();
        Class<?> aClass = demoTest.getClass();
        Method BeforeMethod = getMethodByAnnotation(demoTest.getClass(),Before.class);
        Method AfterMethod = getMethodByAnnotation(demoTest.getClass(),After.class);

        for(Method method : aClass.getMethods()){
            if(method.getAnnotation(Test.class)!=null){
                try {
                    if(BeforeMethod!=null){
                        BeforeMethod.invoke(demoTest);
                    }
                    method.invoke(demoTest);
                    if(AfterMethod!=null){
                        AfterMethod.invoke(demoTest);
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    System.out.println("测试异常！");
                    Throwable throwable = e.getCause();
                    throwable.getMessage();
                    System.out.println(throwable.getMessage());
                    e.printStackTrace();
                }

            }
        }
    }

    public static Method getMethodByAnnotation(Class cls,Class aClass){
        for(Method method : cls.getMethods()){
            if(method.getAnnotation(aClass)!=null){
                return method;
            }
        }
        return null;
    }
}

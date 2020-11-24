package com.edu.Annotation.junit;

/**
 * @program: base-java
 * @description:
 * @author: lihangyu
 * @create: 2020-11-23 19:31
 */
public class DemoTest {
    @Test
    public void test1(){
        System.out.println("test1");
        String a = null;
        a.toString();
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }


    public void test3(){
        System.out.println("test3");
    }

    @Before
    public void before(){
        System.out.println("执行前执行的方法！");
    }

    @After
    public void after(){
        System.out.println("执行后执行的方法！");
    }


}

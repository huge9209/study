package com.edu.Annotation;


import java.lang.annotation.*;

@Target(value = {
        ElementType.TYPE/* 在类上 */,
        ElementType.METHOD /* 方法上 */,
        ElementType.LOCAL_VARIABLE/* 局部变量上 */
})//限定注解在什么位置
@Retention(RetentionPolicy.RUNTIME)
/**
 * 持久性设置：源代码阶段，编译器阶段，运行期阶段(RetentionPolicy.RUNTIME)
 */
public @interface TestAnno {

    /**
     * 定义注解属性： 定义语法类似于接口方法
     * 如果一个属性定义的是数组类型
     * 那么使用数组语法复制，但是如果只赋值一个元素，可以使用单变量形式
     * @return
     */
    String[] value();

    /* 所有注解属性都需要赋值，如果不赋值那么要设置默认值 */
    int age() default 18;

    /* 如果某个属性的名称是value 那么这个属性就是默认属性
    *  默认属性可以不写属性名就进行赋值
    *  前提是值填写该属性，其他属性不填写
    */
}

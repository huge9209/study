package com.edu.eum;

/**
 * @program: base-java
 * @description:
 * @author: lihangyu
 * @create: 2020-11-24 19:02
 */
public enum TestEum {

    TEST_EUM("钟哈哈1",1),
    TEST_EUM1("钟哈哈2",2),
    TEST_EUM2("钟哈哈3",3);

    TestEum(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    TestEum() {
    }

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

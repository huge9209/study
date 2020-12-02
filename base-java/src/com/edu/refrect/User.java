package com.edu.refrect;

/**
 * @program: base-java
 * @description:
 * @author: lihangyu
 * @create: 2020-12-02 18:40
 */
public class User {
    private String name;
    public String age;

    public User() {
    }

    private User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

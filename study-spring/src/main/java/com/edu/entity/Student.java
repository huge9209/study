package com.edu.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @program: study-spring
 * @description:
 * @author: lihangyu
 * @create: 2020-12-16 12:20
 */
public class Student {
    private  String name;
    private Address address;

    private List<String> list;

    private Map<String,String> map;

    private Set<String> set;

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}

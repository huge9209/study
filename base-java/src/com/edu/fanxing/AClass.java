package com.edu.fanxing;

import com.edu.Annotation.junit.After;

import javax.swing.*;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: base-java
 * @description:
 * @author: lihangyu
 * @create: 2020-12-14 21:39
 */
public class AClass {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        List<? extends F> fs = new ArrayList<>();
        //fs.add(new S1()); 不能写  能读



    }
    public <E> List<E> method(E e){
        List<E> list = new ArrayList<>();
        list.add(e);
        return list;
    }
}
class F{
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class S1 extends F {

}
class S2 extends F{

}
@interface I{

}
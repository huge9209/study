package com.edu.collection;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @program: base-java
 * @description:
 * @author: lihangyu
 * @create: 2020-11-23 10:53
 */
public class stream {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person p = new Person("zmm1",18,18);
        list.add(p);
        list.add(p);
        list.add(new Person("zmm3",2,18));
        list.add(new Person("zmm2",3,18));
        System.out.println("=============去重================");
        //去重
        List<Person> distinctList = list.stream().distinct().collect(Collectors.toList());

        distinctList.stream().forEach(item ->{
            System.out.println(item);
        });
        System.out.println("=============过滤================");
        //过滤
        List<Person> filterList = list.stream().filter(item->item.getAge()>3).collect(Collectors.toList());
        filterList.stream().forEach(item->{
            System.out.println(item);
        });

        System.out.println("=============map()================");
        //map(), 提取对象中的某一元素.  用每一项来获得属性（也可以直接用  对象::get属性()）
        List<String> mapList = list.stream().map(Person::getName).collect(Collectors.toList());
        mapList.stream().forEach(o->{
            System.out.println(o);
        });

        //统计
        System.out.println("=============统计================");
        Integer age = list.stream().mapToInt(Person::getAge).sum();
        System.out.println(age);

        // 分组   Collectors.groupingBy(属性名)
        System.out.println("=============分组================");
        Map<Integer, List<Person>> map = list.stream().collect(Collectors.groupingBy(Person::getAge));
        map.forEach((s,L)->{
            System.out.println(s+"  "+L);
        });

        //排序 sorted((第一个对象，第二个对象)->返回值)  （升降序看是第几个对象与第几个对象比较）
        //升序(o1,o2)->o1.getAge()-o2.getAge()
        //降序(o1,o2)->o2.getAge()-o1.getAge()
        System.out.println("=============排序================");
        List<Person> sortedList = list.stream().sorted((o1,o2)->o1.getAge()-o2.getAge()).collect(Collectors.toList());
        sortedList.stream().forEach(o->{
            System.out.println(o);
        });
        System.out.println("=============list转Map================");
        Map<String,Person> listtomap  = list.stream().collect(Collectors.toMap(o->o.getName(),o->o,(k1,k2) -> k1));
        listtomap.forEach(((s, person) -> {
            System.out.println(StringUtils.isNotBlank(s));
            System.out.println(person);
        }));

    }
}

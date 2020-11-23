package com.edu;

import com.edu.entity.Person;
import com.edu.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: study-spring
 * @description:
 * @author: lihangyu
 * @create: 2020-11-12 11:31
 */
public class MainTest {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
//        Person bean = (Person) applicationContext.getBean("person");

        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = applicationContext1.getBean(Person.class);
//        System.out.println(bean.toString());
        System.out.println(person.toString());

        String[] nameForType = applicationContext1.getBeanNamesForType(Person.class);
        for (String name : nameForType){
            System.out.println(name);
        }
    }
}

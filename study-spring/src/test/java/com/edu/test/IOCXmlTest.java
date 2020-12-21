package com.edu.test;

import com.edu.entity.Person;
import com.edu.proxy.aop.UserService;
import com.edu.proxy.aop.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: study-spring
 * @description:
 * @author: lihangyu
 * @create: 2020-12-16 11:29
 */
public class IOCXmlTest {
    public static void main(String[] args) {
        //获取spring的上下文对象！
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) applicationContext.getBean("person");
    }
    @Test
    public void testaop(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userServiceImpl = (UserService) classPathXmlApplicationContext.getBean("UserServiceImpl");

        userServiceImpl.add();
    }
}

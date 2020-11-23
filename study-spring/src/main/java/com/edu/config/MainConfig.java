package com.edu.config;

import com.edu.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: study-spring
 * @description:
 * @author: lihangyu
 * @create: 2020-11-12 11:37
 */
@Configuration //告诉spring这是个配置类
@ComponentScan("com.edu")
public class MainConfig {

    //给容器注册一个Bean ;类型未返回值的类型，id默认是方法名作为id
    @Bean("person2")
    public Person person1(){
        return new Person("li","20");
    }
}

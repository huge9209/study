package com.edu.test;

import com.edu.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

import java.util.Calendar;

/**
 * @program: study-spring
 * @description:
 * @author: lihangyu
 * @create: 2020-11-12 12:09
 */
@Configuration
@ComponentScan(value="com.edu",includeFilters = {//包含
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)
},useDefaultFilters = false)//默认的过滤组件
//,excludeFilters = {//排除
//@ComponentScan.Filter()
//}
//要扫描的包
//@ComponentScan includeFilters
public class IOCTest {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext= new AnnotationConfigApplicationContext(MainConfig.class);
        String[] names = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String name: names) {
            System.out.println(name);
        }


    }
}

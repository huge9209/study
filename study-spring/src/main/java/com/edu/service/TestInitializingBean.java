package com.edu.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

/**
 * @program: study-spring
 * @description:    测试InitializingBean 方法
 * @author: lihangyu
 * @create: 2020-11-20 17:44
 */
@Service
public class TestInitializingBean implements InitializingBean {

    public void afterPropertiesSet() throws Exception {
        System.out.println("TestInitializingBean 已经导入");
    }
}

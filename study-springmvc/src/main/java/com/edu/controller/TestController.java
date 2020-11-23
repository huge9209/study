package com.edu.controller;

import com.edu.config.ResponseResultBody;
import com.edu.entity.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: study-spring
 * @description:
 * @author: lihangyu
 * @create: 2020-11-20 19:00
 */
@RestController
@RequestMapping("test")
@ResponseResultBody
public class TestController {

    @ResponseBody
    @RequestMapping("/get")
    public Object getTest() throws CloneNotSupportedException {
        Person person = new Person("钟哈哈","18");
        person = person.clone();
        return person;
    }
}

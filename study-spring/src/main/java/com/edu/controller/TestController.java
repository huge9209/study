package com.edu.controller;

import com.edu.config.ResponseResultBody;
import com.edu.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: study-spring
 * @description:
 * @author: lihangyu
 * @create: 2020-11-20 19:00
 */
@Controller
@ResponseResultBody
public class TestController {

    @ResponseBody
    @RequestMapping("/")
    public Object getTest(){
        return new Person("钟哈哈","18");
    }
}

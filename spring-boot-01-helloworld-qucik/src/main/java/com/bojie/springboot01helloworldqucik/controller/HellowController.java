package com.bojie.springboot01helloworldqucik.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//这个类所有方法返回的数据直接写给浏览器（如果是对象转为json数据）
//@ResponseBody
//@Controller

@RestController
public class HellowController {
    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/hello")
    public String Hello(){
        return
                "hello world quick"+name;
    }



}

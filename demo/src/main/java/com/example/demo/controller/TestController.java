package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.HelloService;

/**
 * @author wangyu
 * 2019/04/24 20:55
 */
@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/")
    public void test(){
        System.out.println(helloService.sayHello());
    }
}

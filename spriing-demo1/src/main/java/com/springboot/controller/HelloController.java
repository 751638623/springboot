package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 卢宇航
 * @Description
 * @create 2021-06-18 7:33
 */
@RestController
public class HelloController {
@RequestMapping("/hello")
    public String helloSpringBoot(){
        return "hello spring boot 2";
    }
}

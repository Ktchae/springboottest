package com.servicess.springbootinit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${name}")
    private String name;

    @RequestMapping("/hesp")
    public String hello(){
        System.out.println(name);
        return null;
    }

}

package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${test.hello}")
    private String testhello;

    @RequestMapping("/yeah")
    private String Hello(){
        return "yeah!" + testhello;
    }

}

package com.jecihjoy.APlusDemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class HelloController {

    @ResponseBody
    public String sayHello() {
        return "Hello World";
    }
}

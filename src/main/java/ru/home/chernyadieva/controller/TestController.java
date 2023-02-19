package ru.home.chernyadieva.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/hello-world")
    public String message(){
        return "hello-world";
    }
}

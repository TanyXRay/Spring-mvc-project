package ru.home.chernyadieva.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    private String helloPage() {
        return "first/hello";
    }

    @GetMapping("/goodbye")
    private String goodbyePage() {
        return "first/goodbye";
    }
}

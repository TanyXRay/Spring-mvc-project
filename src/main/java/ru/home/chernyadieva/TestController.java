package ru.home.chernyadieva;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/hello-world")
    public String message() {
        return "hello_world";
    }
}

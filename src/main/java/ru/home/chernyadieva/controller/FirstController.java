package ru.home.chernyadieva.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {

    /**
     * 2 способа передать нужные параметры в URL get-запрос
     * @param name
     * @param surname
     * @return
     */
    @GetMapping("/hello")
    private String helloPage(@RequestParam (value = "name", required = false) String name,
                             @RequestParam(value = "surname", required = false) String surname) {
        System.out.println("Hello, " + name + " " + surname);
        return "first/hello";
    }

    //   @GetMapping("/hello")
    //   private String helloPage(HttpServletRequest httpServletRequest) {
    //       String name = httpServletRequest.getParameter("name");
    //       String surname = httpServletRequest.getParameter("surname");
    //       System.out.println("Hello, " +name + " " + surname);
    //       return "first/hello";
    //   }

    @GetMapping("/goodbye")
    private String goodbyePage() {
        return "first/goodbye";
    }
}

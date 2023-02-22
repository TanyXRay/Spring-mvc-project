package ru.home.chernyadieva.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculator")
public class ThirdController {

    @GetMapping("/result")
    private String helloPage(@RequestParam(value = "a", required = false) int a,
                             @RequestParam(value = "b", required = false) int b,
                             @RequestParam(value = "action", required = false) String action, Model model) {
        double resulting = resultCalculate(a, b, action);
        model.addAttribute("resulting", "result = " + resulting);
        return "calculator/result";
    }

    private double resultCalculate(int a, int b, String action) {
        double result;

        switch (action) {
            case "multiplication":
                result = a * b;
                break;
            case "division":
                result = (double) b / a;
                break;
            case "addition":
                result = a + b;
                break;
            case "subtraction":
                result = a - b;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }
}

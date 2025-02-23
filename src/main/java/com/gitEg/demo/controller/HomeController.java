package com.gitEg.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String welcomePage(Model model) {
        model.addAttribute("title", "Welcome to Our E-Commerce Store");
        return "welcome";
    }

    @GetMapping("/welcome")
    public String WelcomePage(Model model) {
        model.addAttribute("title", "Welcome to Our E-Commerce Store");
        return "welcome";
    }
}

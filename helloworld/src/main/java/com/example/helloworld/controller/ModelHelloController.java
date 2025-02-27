package com.example.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ModelHelloController {

    @GetMapping("/hello/o")
    public String sayHello(Model model) {
        model.addAttribute("message", "Hello from BridgeLabz!");
        return "hello";  // This will map to hello.html inside templates
    }
}

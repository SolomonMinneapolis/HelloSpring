package com.solomon.hellospring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // This is a class that contains methods that can respond to user requests
public class HelloController {

    @GetMapping("/") // Represents the home page of the application
    public String greeting(Model model) {

        String name = "Solomon";
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/about") // Represents the home page of the application
    public String about() {
        return "about";
    }
}

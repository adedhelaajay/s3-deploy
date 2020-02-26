package com.jenkins.spring;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping("/greet")
    public String sayHi(){
        return "Greetings!";
    }

    @GetMapping("/name")
    public String getName(Model model, Principal principal) {
        model.addAttribute("name", principal.getName());
        return "Esteemed " + principal.getName();
    }
}

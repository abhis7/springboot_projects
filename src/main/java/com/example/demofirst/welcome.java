package com.example.demofirst;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome to spring boot";
    }

}

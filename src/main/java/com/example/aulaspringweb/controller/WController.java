package com.example.aulaspringweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WController {

    @GetMapping
    public String welcome(){
        return "welcome! !";
    }
}

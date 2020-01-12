package com.hans.springsecuritymemoryauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Daashboard {

    @GetMapping("/")
    public String load(){
        return "Welcome";
    }

    @GetMapping("/Admin")
    public String admin(){
        return "Welcome Admin";
    }

    @GetMapping("/User")
    public String user(){
        return "Welcome User";
    }
}

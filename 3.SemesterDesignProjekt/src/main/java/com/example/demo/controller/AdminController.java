package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/adm")
public class AdminController {

    @GetMapping(value = "/login")
    public String login(){
        return "login";
    }

}

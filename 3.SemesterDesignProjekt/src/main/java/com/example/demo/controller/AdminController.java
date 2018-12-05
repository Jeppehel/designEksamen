package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class AdminController {

    @RequestMapping(value="/login")
    public String login(){
        return "login";
    }

}

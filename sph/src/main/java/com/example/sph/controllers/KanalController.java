package com.example.sph.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KanalController {

    @GetMapping("/kanal")
    public String Kanal(){
        return "Kanal";
    }
}

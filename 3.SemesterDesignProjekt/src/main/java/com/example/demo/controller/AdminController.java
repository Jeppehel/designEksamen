package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

    @RequestMapping(value = "/admin/control")
    public String siteControl() {
        return "admin/SiteControlAdmin";
    }

}

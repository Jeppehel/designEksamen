package com.example.demo.controller;


import com.example.demo.services.PodcastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    PodcastService podcastService;

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("podcasts", podcastService.fetchAll());
        return "/index";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }
}

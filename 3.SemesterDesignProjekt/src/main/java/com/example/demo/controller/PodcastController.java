package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.URL;

@Controller
public class PodcastController {




    @GetMapping("/kanal")
    public String Kanal(Model model){



        return "kanal";
    }

    public String podcastAdd(@RequestParam String overskrift,@RequestParam URL url, @RequestParam String description){



        return "/podcastAdd";
    }
}

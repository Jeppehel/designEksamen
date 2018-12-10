package com.example.demo.controller;

import com.example.demo.domain.Podcast;
import com.example.demo.services.IPodcast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.URL;

@Controller
public class PodcastController {

    @Autowired
    IPodcast iPodcast;


    @GetMapping("/kanal")
    public String Kanal(Model model){

        model.addAttribute("podcasts", iPodcast.viewPodcast());

        return "kanal";
    }

    public String podcastAdd(@RequestParam String overskrift,@RequestParam URL url, @RequestParam String description){



        return "/podcastAdd";
    }
}

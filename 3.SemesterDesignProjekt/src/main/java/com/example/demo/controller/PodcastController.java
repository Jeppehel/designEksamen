package com.example.demo.controller;

import com.example.demo.domain.Podcast;
import com.example.demo.services.IPodcast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/submitPodcast", method = RequestMethod.GET)
    public String podcastAdd(Model model){
        model.addAttribute("podcast", new Podcast());
        return "SubmitPodcast";
    }

    @RequestMapping(value = "/submitPodcast", method = RequestMethod.POST)
    public String podcastAdd(@ModelAttribute Podcast podcast){
        iPodcast.createPodcast(podcast);
        return "redirect:/";
    }
}

package com.example.demo.controller;

import com.example.demo.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/news/")
public class NewsController {

    @Autowired
    private NewsService newsService;


    @RequestMapping (value = "/news")
    public String viewNews(Model model){

        model.addAttribute("news", newsService.viewNews());

        return "News";
    }


    @RequestMapping (value = "/article")
    public String viewArticles (Model model){

        model.addAttribute("news", newsService.viewNews());

        return "Article";
    }




}

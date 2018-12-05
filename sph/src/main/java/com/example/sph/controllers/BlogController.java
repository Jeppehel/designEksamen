package com.example.sph.controllers;

import com.example.sph.services.BlogService;
import org.springframework.stereotype.Controller;

@Controller
public class BlogController {

    private BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }



}

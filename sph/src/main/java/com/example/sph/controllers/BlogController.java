package com.example.sph.controllers;

import com.example.sph.domains.BlogEntry;
import com.example.sph.services.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
public class BlogController {

    private BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @RequestMapping(value = "/blog")
    public String viewBlogEntries(Model model) {

        model.addAttribute("admin", true);
        model.addAttribute("blogEntries", blogService.fetchAllBlogs());
        return "BlogEntries";
    }

    @RequestMapping(value = "/submitBlog", method = RequestMethod.GET)
    public String submitBlog(Model model) {
        model.addAttribute("blogEntry", new BlogEntry());
        return "SubmitBlogEntry";
    }

    @RequestMapping(value = "/submitBlog", method = RequestMethod.POST)
    public String submitBlog(@ModelAttribute BlogEntry blogEntry) {
        blogEntry.setDate(new Date());
        blogService.saveBlogEntry(blogEntry);
        return "redirect:/";
    }
}

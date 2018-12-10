package com.example.demo.controller;

import com.example.demo.domain.BlogEntry;
import com.example.demo.domain.Comment;
import com.example.demo.services.BlogService;
import com.example.demo.services.CommentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
public class BlogController {

    private BlogService blogService;
    private CommentService commentService;

    public BlogController(BlogService blogService, CommentService commentService) {
        this.blogService = blogService;
        this.commentService = commentService;
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

    private int tempBlogId = 0;

    @RequestMapping(value = "/submitComment/{id}", method = RequestMethod.GET)
    public String submitComment(@PathVariable("id") int blogId, Model model) {
        model.addAttribute("blogEntry", blogService.getBlogByID(blogId));
        model.addAttribute("comments", commentService.getAllCommentsByID(blogId));
        tempBlogId = blogId;
        model.addAttribute("comment", new Comment());
        return "SubmitComment";
    }

    @RequestMapping(value = "/submitComment", method = RequestMethod.POST)
    public String submitComment(@ModelAttribute Comment comment) {
        comment.setBlogId(tempBlogId);
        comment.setDate(new Date());
        comment.setIfAnon();
        commentService.saveComment(comment);
        //set new number of comments on blog object
        blogService.getBlogByID(tempBlogId).setNumberOfComments(commentService.getNumberOfComments(tempBlogId));
        blogService.saveBlogEntry(blogService.getBlogByID(tempBlogId));
        return "redirect:/";
    }

}

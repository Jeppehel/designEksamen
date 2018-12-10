package com.example.demo.services;

import com.example.demo.domain.BlogEntry;

public interface BlogService {

    void saveBlogEntry(BlogEntry blogEntry);
    BlogEntry getBlogByID(int id);
    Iterable<BlogEntry> fetchAllBlogs();
}

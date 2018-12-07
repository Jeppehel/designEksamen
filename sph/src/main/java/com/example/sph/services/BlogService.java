package com.example.sph.services;

import com.example.sph.domains.BlogEntry;

public interface BlogService {

    void saveBlogEntry(BlogEntry blogEntry);
    Iterable<BlogEntry> fetchAllBlogs();
}

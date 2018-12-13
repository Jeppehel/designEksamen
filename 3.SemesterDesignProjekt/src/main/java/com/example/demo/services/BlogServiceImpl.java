package com.example.demo.services;

import com.example.demo.domain.BlogEntry;
import com.example.demo.repositories.BlogRepository;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {

    private BlogRepository blogRepository;

    public BlogServiceImpl(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Override
    public void saveBlogEntry(BlogEntry blogEntry) {
        blogRepository.save(blogEntry);
    }

    @Override
    public BlogEntry getBlogByID(int id) {
        Iterable<BlogEntry> blogEntries = blogRepository.findAll();
        for(BlogEntry blogEntry : blogEntries) {
            if (blogEntry.getId() == id) {
                return blogEntry;
            }
        }
        return null;
    }


    @Override
    public Iterable<BlogEntry> fetchAllBlogs() {
        return blogRepository.findAll();
    }


}

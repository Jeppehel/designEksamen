package com.example.sph.services;

import com.example.sph.domains.BlogEntry;
import com.example.sph.repositories.BlogRepository;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {

    private BlogRepository blogRepository;

    public BlogServiceImpl(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Override
    public void save(BlogEntry blogEntry) {
        blogRepository.save(blogEntry);
    }
}

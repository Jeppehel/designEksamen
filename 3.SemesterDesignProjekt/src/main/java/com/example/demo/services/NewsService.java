package com.example.demo.services;

import com.example.demo.domain.News;

import java.util.List;

public interface NewsService {

    void createNews (News news);

    News getNewsByID(int id);

    Iterable<News> fetchAllNews();

    List<News> viewNews();


}

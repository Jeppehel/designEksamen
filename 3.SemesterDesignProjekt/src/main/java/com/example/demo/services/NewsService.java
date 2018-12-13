package com.example.demo.services;

import com.example.demo.domain.News;

public interface NewsService {

    void createNews (News news);

    News getNewsByID(int id);

    Iterable<News> fetchAllNews();



}

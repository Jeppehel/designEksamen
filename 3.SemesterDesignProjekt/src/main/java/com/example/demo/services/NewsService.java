package com.example.demo.services;

import com.example.demo.domain.News;
import com.example.demo.repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class NewsService implements NewsServiceImpl {

    @Autowired
    private NewsRepository newsRepository;

    public void createNews(News news){

        newsRepository.save(new News(news.getDate(), news.getTitle(), news.getDescription(), news.getImage()));

    }


}

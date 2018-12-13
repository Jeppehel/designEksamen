package com.example.demo.services;


import com.example.demo.domain.News;
import com.example.demo.repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsRepository newsRepository;

    public void createNews(News news){

        newsRepository.save(new News(news.getDate(), news.getTitle(), news.getDescription(), news.getImage()));

    }

    public Iterable<News> fetchAllNews() {
        return newsRepository.findAll();
    }


    
    public News getNewsByID(int id) {
        Iterable<News> allnews = newsRepository.findAll();
        for(News news : allnews) {
            if (news.getId() == id) {
                return news;
            }
        }
        return null;
    }




}

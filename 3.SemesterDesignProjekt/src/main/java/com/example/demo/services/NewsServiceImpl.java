package com.example.demo.services;


import com.example.demo.domain.News;
import com.example.demo.repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<News> viewNews() {
        List<News> news = (List<News>) newsRepository.findAll();
        return news;
    }
    
    public News getNewsByID(int id) {
        Iterable<News> allNews = newsRepository.findAll();
        for(News news : allNews) {
            if (news.getId() == id) {
                return news;
            }
        }
        return null;
    }


    public void deleteNews(int id){

        if (getNewsByID(id) != null){
            newsRepository.delete(getNewsByID(id));
        }

    }

    public void editNews(News news) {

        newsRepository.save(news);

    }




}

package com.oclock.news;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class NewsService {
    @Autowired
    NewsDao newsDao;

    public Iterable<News> getNewsByCategory(String category){
        List<News> news;
        news = newsDao.findAllByCategory(category);
        return news;
    }

    public Iterable<News> getNews(){
        List<News> news;
        news = newsDao.findAll();
        return news;
    }

    public News createNews(News news){
        newsDao.save(news);
        return news;
    }
}

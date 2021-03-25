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

    public Iterable<News> getNewsByCategory(Integer category){
        List<News> news = new ArrayList<>();
        news = newsDao.findAllByCategory(category);
        return news;
    }

    public Iterable<News> getNews(){
        List<News> news = new ArrayList<>();
        news = newsDao.findAll();
        return news;
    }

    public News createNews(){
        News news = new News();
        news.setTitle("어쩌");
        news.setContent("저쩌구");
        news.setCreate_date(LocalDate.now());
        news.setCategory(100);
        newsDao.save(news);
        return news;
    }
}

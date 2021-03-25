package com.oclock.news;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class NewsController {
    @Autowired
    private NewsDao newsDao;

    @Autowired
    private NewsService newsService;

    @Transactional
    @GetMapping("/news")
    public Iterable<News> getNews(@RequestParam(required=false) Integer category){
        if (category != null)
            return this.newsService.getNewsByCategory(category);
        else
            return this.newsService.getNews();
    }

    @Transactional
    @PostMapping
    public News addNews(News news){
        News res = this.newsService.createNews();

        return res;
    }



}

package com.oclock.news;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Repository
public interface NewsDao extends JpaRepository<News, Integer> {
    List<News> findAllByCategory(int category);
}

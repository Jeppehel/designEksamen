package com.example.demo.repositories;

import com.example.demo.domain.News;
import org.springframework.data.repository.CrudRepository;

public interface NewsRepository extends CrudRepository<News, Long> {
}

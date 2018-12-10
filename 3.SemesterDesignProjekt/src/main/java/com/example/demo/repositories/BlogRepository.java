package com.example.demo.repositories;

import com.example.demo.domain.BlogEntry;
import org.springframework.data.repository.CrudRepository;

public interface BlogRepository extends CrudRepository<BlogEntry, Long> {
}

package com.example.sph.repositories;

import com.example.sph.domains.BlogEntry;
import org.springframework.data.repository.CrudRepository;

public interface BlogRepository extends CrudRepository<BlogEntry, Long> {
}

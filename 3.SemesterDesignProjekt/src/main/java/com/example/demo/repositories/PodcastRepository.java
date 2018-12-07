package com.example.demo.repositories;

import com.example.demo.domain.Podcast;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PodcastRepository extends CrudRepository<Podcast, Long> {



}

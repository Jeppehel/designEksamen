package com.example.demo.services;

import com.example.demo.domain.Podcast;
import com.example.demo.repositories.PodcastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PodcastService implements IPodcast {

    @Autowired
    PodcastRepository podcastRepository;

    public void createPodcast(Podcast podcast) {
        podcast.setEmbedUrl();
        podcastRepository.save(podcast);
    }

    public void deletePodcast(Long id) {

        if (podcastRepository.findById(id) != null) {
            podcastRepository.deleteById(id);
        }
    }



    @Override
    public void editPodcasts(Podcast podcast) {

        podcastRepository.save(podcast);

    }

    public List<Podcast> viewPodcast() {
        List<Podcast> podcast = (List<Podcast>) podcastRepository.findAll();
        return podcast;
    }

    public Iterable<Podcast> fetchAll() {
        return podcastRepository.findAll();
    }
}

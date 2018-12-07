package com.example.demo.services;

import com.example.demo.domain.Podcast;

public interface IPodcast {

    void createPodcast(Podcast podcast);

    void deletePodcast(Long id);

    void editPodcasts(Podcast podcast);
}

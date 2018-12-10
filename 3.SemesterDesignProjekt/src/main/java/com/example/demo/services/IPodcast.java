package com.example.demo.services;

import com.example.demo.domain.Podcast;

import java.util.List;

public interface IPodcast {

    void createPodcast(Podcast podcast);

    void deletePodcast(Long id);

    void editPodcasts(Podcast podcast);
    List<Podcast> viewPodcast();
}

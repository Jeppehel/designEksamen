package com.example.demo.services;

import com.example.demo.domain.Comment;

import java.util.ArrayList;

public interface CommentService {

    void saveComment(Comment comment);
    Iterable<Comment> fetchAllComments();
    ArrayList<Comment> getAllCommentsByID(int blogID);
    int getNumberOfComments(int blogId);
}
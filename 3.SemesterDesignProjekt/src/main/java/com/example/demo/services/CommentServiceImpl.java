package com.example.demo.services;

import com.example.demo.domain.Comment;
import com.example.demo.repositories.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CommentServiceImpl implements CommentService {

    private CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public void saveComment(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public Iterable<Comment> fetchAllComments() {
        return commentRepository.findAll();
    }

    @Override
    public ArrayList<Comment> getAllCommentsByID(int blogID) {
        Iterable<Comment> allComments = commentRepository.findAll();
        ArrayList<Comment> arrayOfCommentsWithBlogId = new ArrayList<>();
        for(Comment comment : allComments) {
            if(comment.getBlogId() == blogID) {
                arrayOfCommentsWithBlogId.add(comment);
            }
        }
        return arrayOfCommentsWithBlogId;
    }

    @Override
    public int getNumberOfComments(int blogId) {
        return getAllCommentsByID(blogId).size();
    }
}
package com.example.demo.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //foreign key
    private int blogId;
    private String user;
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date date;
    @Lob
    @Column
    private String content;

    public Comment() {
    }

    public Comment(int blogId) {
        this.blogId = blogId;
    }

    public void setIfAnon() {
        if(user.isEmpty()) {
            user = "Anonym bruger";
        }
    }

    public int getId() {
        return id;
    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

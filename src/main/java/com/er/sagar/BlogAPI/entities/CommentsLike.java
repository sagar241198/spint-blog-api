package com.er.sagar.BlogAPI.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class CommentsLike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private PostComments postComments;

    @ManyToOne
    private User user;

    public CommentsLike() {

    }

    public CommentsLike(PostComments postComments, User user) {
        this.postComments = postComments;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public PostComments getPostComments() {
        return postComments;
    }

    public void setPostComments(PostComments postComments) {
        this.postComments = postComments;
    }

}

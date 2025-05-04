package com.er.sagar.BlogAPI.DTO;

import org.springframework.stereotype.Component;

import com.er.sagar.BlogAPI.entities.PostComments;

@Component
public class PostCommentsDto {

    private Long id;
    private String comment;
    private String commentedBy;
    private Long post;
    private Long user;

    public PostCommentsDto() {

    }

    public PostCommentsDto(PostComments postComments) {
        this.id = postComments.getId();
        this.comment = postComments.getComment();
        this.commentedBy = postComments.getUser().getName();
        this.user = postComments.getUser().getId();
        this.post = postComments.getPost().getId();

    }

    public Long getId() {
        return id;
    }

    public void getId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCommentedBy() {
        return commentedBy;
    }

    public void setCommentedBy(String commentedBy) {
        this.commentedBy = commentedBy;
    }

    public Long getPost() {
        return post;
    }

    public void setPostId(Long post) {
        this.post = post;
    }

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }

}

package com.er.sagar.BlogAPI.DTO;

import org.springframework.stereotype.Component;

@Component
public class CommentsRequestDto {

    private Long user;
    private Long post;
    private String comment;

    public CommentsRequestDto() {

    }

    public CommentsRequestDto(Long user, Long post, String comment) {
        this.user = user;
        this.post = post;
        this.comment = comment;
    }

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }

    public Long getPost() {
        return post;
    }

    public void setPost(Long post) {
        this.post = post;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}

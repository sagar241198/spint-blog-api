package com.er.sagar.BlogAPI.DTO;

import org.springframework.stereotype.Component;

import com.er.sagar.BlogAPI.entities.PostLike;

@Component
public class PostLikesDto {

    private Long id;
    private Long userId;
    private String likedBy;
    private Long postId;

    public PostLikesDto() {

    }

    public PostLikesDto(PostLike postLike) {
        this.id = postLike.getId();
        this.likedBy = postLike.getUser().getName();
        this.postId = postLike.getPost().getId();
        this.userId = postLike.getUser().getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLikedBy() {
        return likedBy;
    }

    public void setLikedBy(String likedBy) {
        this.likedBy = likedBy;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

}

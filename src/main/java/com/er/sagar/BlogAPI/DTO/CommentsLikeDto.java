package com.er.sagar.BlogAPI.DTO;

import com.er.sagar.BlogAPI.entities.CommentsLike;

public class CommentsLikeDto {

    private Long id;
    private Long userId;
    private String likedBy;
    private Long commentId;

    public CommentsLikeDto() {

    }

    public CommentsLikeDto(CommentsLike commentsLike) {
        this.id = commentsLike.getId();
        this.userId = commentsLike.getUser().getId();
        this.likedBy = commentsLike.getUser().getName();
        this.commentId = commentsLike.getPostComments().getId();
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

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }
}

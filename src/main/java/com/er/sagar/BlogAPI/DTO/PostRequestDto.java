package com.er.sagar.BlogAPI.DTO;

import org.springframework.stereotype.Component;

@Component
public class PostRequestDto {

    private String image;
    private String title;
    private String description;
    private Long user;

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setUser(Long user) {
        this.user = user;
    }

    public Long getUser() {
        return user;
    }

}

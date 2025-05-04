package com.er.sagar.BlogAPI.DTO;

import org.springframework.stereotype.Component;

import com.er.sagar.BlogAPI.entities.User;

@Component
public class LoginResponse {

    private Long id;
    private String name;
    private String email;
    private String token;

    public LoginResponse() {
    }

    public LoginResponse(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.token = user.getToken();
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}

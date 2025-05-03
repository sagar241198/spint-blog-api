package com.er.sagar.BlogAPI.exceptions;

public class ErrorResponse {

    private String message;
    private int status;
    private long timestamp;

    public ErrorResponse() {

    }

    public ErrorResponse(String message, int status) {
        this.message = message;
        this.status = status;
        this.timestamp = System.currentTimeMillis();
    }

    // getters and setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

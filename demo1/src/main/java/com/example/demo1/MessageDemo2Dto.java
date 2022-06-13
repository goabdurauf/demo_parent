package com.example.demo1;

public class MessageDemo2Dto {
    private Long id;
    private String message;

    public MessageDemo2Dto(Long id, String message) {
        this.id = id;
        this.message = message;
    }

    public MessageDemo2Dto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

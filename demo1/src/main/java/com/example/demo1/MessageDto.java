package com.example.demo1;

public class MessageDto {
    private Long id;
    private String message;
    private Long createdDate;

    public MessageDto(Long id, String message, Long createdDate) {
        this.id = id;
        this.message = message;
        this.createdDate = createdDate;
    }

    public MessageDto() {
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

    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }
}

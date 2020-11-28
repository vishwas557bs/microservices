package com.example.helloworld.exception;

import java.util.Date;

public class ExceptionResponse {

    //timestamp
    //message
    //description of the error

    private Date timeStamp;
    private String message;
    private String description;

    public ExceptionResponse(Date timeStamp, String message, String description) {
        this.timeStamp = timeStamp;
        this.message = message;
        this.description = description;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

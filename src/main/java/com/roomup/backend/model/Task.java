package com.roomup.backend.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Task {

    public Long getTaskID() {
        return taskID;
    }

    public void setTaskID(Long taskID) {
        this.taskID = taskID;
    }

    @Id
    @GeneratedValue
    private Long taskID;
    private String service;
    @Temporal(TemporalType.DATE)
    private Date date;
    private String description;
    private String feedback;
    private Long status;

    public Task() {
    }

    public Task(String service, Date date,String description, String feedback, Long status) {
        this.service = service;
        this.date = date;
        this.description = description;
        this.feedback = feedback;
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
}

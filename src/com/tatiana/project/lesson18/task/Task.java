package com.tatiana.project.lesson18.task;

import java.time.LocalDateTime;

public class Task {
    private int id;
    private String title;
    private Status status;
    private LocalDateTime createdAt;
    private LocalDateTime closeTo;

    // геттеры, сеттеры и т.д.

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Status getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getCloseTo() {
        return closeTo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setCloseTo(LocalDateTime closeTo) {
        this.closeTo = closeTo;
    }

    public enum Status{
        NEW, IN_PROGRESS, CLOSED
    }


}
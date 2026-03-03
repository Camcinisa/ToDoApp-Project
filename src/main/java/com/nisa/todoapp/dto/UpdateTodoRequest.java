package com.nisa.todoapp.dto;

import jakarta.validation.constraints.NotBlank;

public class UpdateTodoRequest {

    @NotBlank(message = "Title boş olamaz")
    private String title;

    private boolean completed;

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
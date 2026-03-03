package com.nisa.todoapp.dto;

import jakarta.validation.constraints.NotBlank;

public class CreateTodoRequest {

    @NotBlank(message = "Title boş olamaz")
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
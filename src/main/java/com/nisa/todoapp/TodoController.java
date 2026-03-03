package com.nisa.todoapp;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import jakarta.validation.Valid;
import com.nisa.todoapp.dto.CreateTodoRequest;
import com.nisa.todoapp.dto.UpdateTodoRequest;
import com.nisa.todoapp.dto.TodoResponse;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @GetMapping
    public List<TodoResponse> getAll() {
        return service.getAll();
    }

    @PostMapping
    public TodoResponse create(@Valid @RequestBody CreateTodoRequest request) {
        return service.create(request);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }


    @PutMapping("/{id}")
    public TodoResponse update(
            @PathVariable Long id,
            @Valid @RequestBody UpdateTodoRequest request) {

        return service.update(id, request);
    }

    @GetMapping("/{id}")
    public TodoResponse getById(@PathVariable Long id) {
        return service.getById(id);
    }
}
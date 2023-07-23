package com.example.todo.services;

import com.example.todo.models.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoService {
    List<Todo> getAllTodos();
    Optional<Todo> getTodoById(Long id);
    Todo saveTodo(Todo todo);
    void deleteTodo(Long id);
}

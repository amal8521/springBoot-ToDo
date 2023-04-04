package com.example.springboottodoapp.services;

import com.example.springboottodoapp.models.TodoItem;
import com.example.springboottodoapp.repositories.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

// this service references interface(todoItemRepository)
@Service
public class TodoItemService {

//    autowired is used to pull in the TodoItemRepository
    @Autowired
    private TodoItemRepository todoItemRepository;

    public Iterable<TodoItem> getAll() {
        return todoItemRepository.findAll();
    }

    public Optional<TodoItem> getById(Long id) {
        return todoItemRepository.findById(id);
    }
//  if an item not already exists  createdTime else updatedTime
    public TodoItem save(TodoItem todoItem) {
        if(todoItem.getId() == null) {
            todoItem.setCreatedAt(Instant.now());
        }
        todoItem.setUpdatedAt(Instant.now());
        return todoItemRepository.save(todoItem);
    }

    public void delete(TodoItem todoItem) {
        todoItemRepository.delete(todoItem);
    }
}

package com.example.springboottodoapp.repositories;

import com.example.springboottodoapp.models.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// this repository refernces todoItem object (TodoItem class)
@Repository
public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {

}

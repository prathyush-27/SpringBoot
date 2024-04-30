package com.web_example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web_example.TodoItem;

public interface TodoRepository extends JpaRepository<TodoItem, Long>
{

}

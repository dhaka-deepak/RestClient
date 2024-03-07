package com.deepak.Rest_Template.controller;

import com.deepak.Rest_Template.model.Todo;
import com.deepak.Rest_Template.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/{id}")
    public Todo getSingleTodo(@PathVariable int id){
        return this.todoService.getTodo(id);
    }

    @GetMapping("/")
    public List<Todo> getTodos(){
        return this.todoService.getTodos();
    }

    @PostMapping("/")
    public Todo createTodo(@RequestBody Todo todo){
        return this.todoService.createPost(todo);
    }
}

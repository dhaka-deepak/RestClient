package com.deepak.Rest_Template.service;

import com.deepak.Rest_Template.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private RestClient restClient;

    //get single todo
    public Todo getTodo(int id){
        // call to api to get todo data
        return restClient.get()
                .uri("/todos/{id}", id)
                .retrieve()
                .body(Todo.class);
    }

    //get all todos
    public List<Todo> getTodos(){
        return restClient.get()
                .uri("/todos")
                .retrieve()
                .body(new ParameterizedTypeReference<List<Todo>>() {
                });
    }

    //create post
    public Todo createPost(Todo todo){
        return restClient.post()
                .uri("/todos")
                .contentType(MediaType.APPLICATION_JSON)
                .body(todo)
                .retrieve()
                .body(Todo.class);
    }
}

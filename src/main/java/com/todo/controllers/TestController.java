package com.todo.controllers;

import com.todo.models.Todo;
import com.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/tasks")
public class TestController {
    @Autowired
    private TodoService todoService ;

    @GetMapping(value = "/all" )
    public List<Todo> getAllTasks(){
    return todoService.getAllTasks();
    }

    @GetMapping(value = "/{id}" )
    public Todo geTaskById(@PathVariable int id){
        return todoService.getTaskById(id);
    }

    @PostMapping(value = "/add")
    public void addNew(@RequestBody Todo todo ){
        todoService.addNewTask(todo);
        }

    @PutMapping(value = "/update")
    public void updateTask(@RequestBody Todo todo){
        todoService.updateTask(todo);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteTask(@PathVariable int id ){
        todoService.deleteTask(id);
    }

}




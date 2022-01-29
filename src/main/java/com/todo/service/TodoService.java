package com.todo.service;

import com.todo.models.Todo;
import com.todo.repository.TasksRepoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TasksRepoServices tasksRepoServices;



    public List<Todo> getAllTasks(){
        List<Todo> tasks = new ArrayList<>();
        tasksRepoServices.findAll().forEach(tasks::add);
        return tasks ;
    }


    public Todo getTaskById(int id) {
        Todo todo = tasksRepoServices.findById(id).get();
        return todo;
    }
    public void addNewTask(Todo todo) {
       tasksRepoServices.save(todo);
    }

    public void deleteTask(int id) {
       tasksRepoServices.deleteById(id);
    }
    public void updateTask(Todo todo) {
       tasksRepoServices.save(todo);
    }
}

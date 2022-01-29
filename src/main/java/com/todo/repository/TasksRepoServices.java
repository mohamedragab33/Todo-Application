package com.todo.repository;

import com.todo.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TasksRepoServices extends CrudRepository<Todo, Integer> {

}

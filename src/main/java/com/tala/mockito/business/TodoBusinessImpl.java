package com.tala.mockito.business;

import com.tala.mockito.data.api.TodoService;

import java.util.ArrayList;
import java.util.List;

//TodoService dependency
public class TodoBusinessImpl {
    private TodoService todoService;

    public TodoBusinessImpl(TodoService todoService) {
        this.todoService = todoService;
    }

    public List<String> retrieveTodosRelatedToTala(String user) {
        List<String> filteredTodos = new ArrayList<String>();
        List<String> todos = todoService.retrieveTodos(user);

        for (String todo : todos) {
            if (todo.contains("Tala")) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
}
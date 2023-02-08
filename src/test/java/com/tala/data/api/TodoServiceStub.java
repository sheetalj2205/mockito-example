package com.tala.data.api;

import com.tala.mockito.data.api.TodoService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {
    public List<String> retrieveTodos(String User){ //getting this output when user is dummy
        return Arrays.asList("welcome to tala", "learn mockito", "tala is awesome");
    }
}

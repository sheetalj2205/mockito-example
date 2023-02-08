package com.tala.mockito.data.api;
import java.util.List;

//create TodoServiceStub
//Test TodoBusinessImpl with TodoServiceStub
public interface TodoService {
    public List<String> retrieveTodos(String user);
}

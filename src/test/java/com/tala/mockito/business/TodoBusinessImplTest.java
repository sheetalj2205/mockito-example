package com.tala.mockito.business;

import com.tala.data.api.TodoServiceStub;
import com.tala.mockito.data.api.TodoService;
import junit.framework.TestCase;
import java.util.List;

public class TodoBusinessImplTest extends TestCase {

    public void testRetrieveTodosRelatedToTala_usingStub(){
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceStub);
        List<String> filteredTodos = todoBusiness.retrieveTodosRelatedToTala("dummy");
        assertEquals(2, filteredTodos.size()); //getting 2 values from serviceStub, assertEquals check if the given value or size of output is same or not

    }

}
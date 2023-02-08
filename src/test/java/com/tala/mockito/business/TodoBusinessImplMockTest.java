package com.tala.mockito.business;

import com.tala.data.api.TodoServiceStub;
import com.tala.mockito.data.api.TodoService;
import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TodoBusinessImplMockTest extends TestCase {

    public void testRetrieveTodosRelatedToTala_usingMock(){
        TodoService todoServiceMock = mock(TodoService.class); //returning a empty list back
        //dynamic conditions can be applied
        List<String> todos = Arrays.asList();

        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);

        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceMock);
        List<String> filteredTodos = todoBusiness.retrieveTodosRelatedToTala("Dummy");
        assertEquals(0, filteredTodos.size()); //getting 2 values from serviceStub, assertEquals check if the given value or size of output is same or not

    }

}
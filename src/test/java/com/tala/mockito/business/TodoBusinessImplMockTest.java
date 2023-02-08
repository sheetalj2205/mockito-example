package com.tala.mockito.business;

import com.tala.data.api.TodoServiceStub;
import com.tala.mockito.data.api.TodoService;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.BDDMockito.given;
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
        assertEquals(0, filteredTodos.size());

    }
    @Test
    public void testRetrieveTodosRelatedToTala_usingBDD(){
        //Given
        TodoService todoServiceMock = mock(TodoService.class); //create mock
        List<String> todos = Arrays.asList("hello tala", "tala is awesome");
        given(todoServiceMock.retrieveTodos("Dummy")).willReturn(todos);
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceMock);

        //When
        List<String> filteredTodos = todoBusiness.retrieveTodosRelatedToTala("Dummy");

        //Then
        assertEquals(2, filteredTodos.size());

    }

}
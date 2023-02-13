package com.tala.mockito.business;

import com.tala.data.api.TodoServiceStub;
import com.tala.mockito.data.api.TodoService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TodoBusinessImplInjectMockTest extends TestCase {
    @Mock
    TodoService todoServiceMock;//TodoService todoServiceMock = mock(TodoService.class)
    @InjectMocks
    TodoBusinessImpl todoBusinessImpl; //removes the line TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);

    @Test
    public void testRetrieveTodosRelatedToTala_usingInjectMock(){

        List<String> todos = Arrays.asList("Hi Tala", "Welcome to Tala");

        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);

        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToTala("Dummy");

        assertEquals(2, filteredTodos.size()); //getting 2 values from serviceStub, assertEquals check if the given value or size of output is same or not

    }

}
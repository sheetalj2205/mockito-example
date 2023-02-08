package com.tala.mockito;

import org.junit.Test;

import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockList {

    @Test
    public void mockListTest(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);
        assertEquals(2, listMock.size());

    }
    @Test
    public void mockListTestReturnMultipleValues(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2).thenReturn(3);
        assertEquals(2, listMock.size());
        assertEquals(3, listMock.size());

    }
    @Test
    public void mockListGetTestReturnMultipleValues(){
        List listMock = mock(List.class);
        //Any argument matcher
        when(listMock.get(anyInt())).thenReturn("Hello Talazen");
        assertEquals("Hello Talazen", listMock.get(0));
    }
}

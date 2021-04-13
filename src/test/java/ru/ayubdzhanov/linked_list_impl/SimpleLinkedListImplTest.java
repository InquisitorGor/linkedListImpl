package ru.ayubdzhanov.linked_list_impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleLinkedListImplTest {

    @Test
    public void addTest(){
        LinkedList list = new SimpleLinkedListImpl();
        list.add(1);
        assertEquals(1, list.get(0));
    }

    @Test
    public void removeTest(){
        LinkedList list = new SimpleLinkedListImpl();
        list.add(1);
        assertEquals(1, list.get(0));
        list.remove();
        assertTrue(list.isEmpty());
    }

    @Test
    public void removeTest2(){
        LinkedList list = new SimpleLinkedListImpl();
        list.add(5);
        list.add(10);
        list.remove(10);
        assertFalse(list.find(10));
    }

    @Test
    public void findTest(){
        LinkedList list = new SimpleLinkedListImpl();
        list.add(5);
        list.add(10);
        assertFalse(list.find(15));
        assertTrue(list.find(5));
    }
}
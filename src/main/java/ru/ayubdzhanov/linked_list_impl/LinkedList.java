package ru.ayubdzhanov.linked_list_impl;

public interface LinkedList {
    void add(int value);

    void remove();

    void remove(int value);

    boolean find(int value);

    boolean isEmpty();

    int getSize();

    void display();
}

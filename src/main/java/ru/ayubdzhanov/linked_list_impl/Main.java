package ru.ayubdzhanov.linked_list_impl;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new SimpleLinkedListImpl();
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("Size: " + linkedList.getSize());
        linkedList.display();
        linkedList.remove(4);
        linkedList.remove();
        linkedList.display();
        System.out.println(linkedList.find(7));
    }
}

package ru.ayubdzhanov.linked_list_impl;

public class SimpleLinkedListImpl implements LinkedList {
    protected Node firstElement;
    protected int size;

    @Override
    public void add(int value) {
        Node node = new Node(value);
        node.setNextElement(firstElement);
        firstElement = node;
        size++;
    }

    @Override
    public void remove() {
        if (isEmpty()) return;
        firstElement = firstElement.getNextElement();
        size--;
    }

    @Override
    public void remove(int value) {
        Node currentNode = firstElement;
        Node previousNode = null;

        while (currentNode != null) {
            if (currentNode.getData() == value) break;
            previousNode = currentNode;
            currentNode = currentNode.getNextElement();
        }

        if (currentNode == null) return;
        if (previousNode == null) firstElement = currentNode.getNextElement();//If deleted element is first
        else previousNode.setNextElement(currentNode.getNextElement());
        size--;
    }

    @Override
    public boolean find(int value) {
        Node currentNode = firstElement;
        while (currentNode != null) {
            if (currentNode.getData() == value) return true;
            currentNode = currentNode.getNextElement();
        }
        return false;
    }

    @Override
    public void display() {
        Node currentNode = firstElement;
        System.out.println("------The Start-------");
        while (currentNode != null) {
            System.out.println(currentNode);
            currentNode = currentNode.getNextElement();
        }
        System.out.println("------The End-------");
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int get(int index) {
        Node currentNode = firstElement;
        int listIndex = 0;
        while (currentNode != null) {
            if (listIndex == index) return currentNode.getData();
            currentNode = currentNode.getNextElement();
            listIndex++;
        }
        return -1;
    }

    public Node getFirstElement() {
        return firstElement;
    }

    public void setFirstElement(Node firstElement) {
        this.firstElement = firstElement;
    }
}

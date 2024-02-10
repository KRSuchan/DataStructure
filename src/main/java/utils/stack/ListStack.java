package utils.stack;


import utils.Node;

import java.util.EmptyStackException;

public class ListStack<E> implements Stack {

    private Node<E> top;
    private int size;


    public ListStack() {
        top = null;
        size = 0;
    }

    public void push(Object newItem) {
        Node newNode = new Node(newItem, top);
        top = newNode;
        size++;
    }

    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        E topItem = top.getItem();
        top = top.getNext();
        size--;
        return topItem;
    }

    public E peek() {
        if (isEmpty()) throw new EmptyStackException();
        return top.getItem();
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public int getSize() {
        return size;
    }
}

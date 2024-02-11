package utils.Queue;

import utils.Node;

import java.util.NoSuchElementException;

public class ListQueue<E> implements Queue {
    private Node<E> front, rear;
    private int size;

    public ListQueue() {
        front = null;
        rear = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public void add(Object newItem) {
        Node newNode = new Node(newItem, null);
        if (isEmpty()) front = newNode;
        else rear.setNext(newNode);
        rear = newNode;
        size++;
    }

    public E remove() {
        if (isEmpty()) throw new NoSuchElementException();
        E frontItem = front.getItem();
        front = front.getNext();
        if (isEmpty()) rear = null;
        size--;
        return frontItem;
    }
}

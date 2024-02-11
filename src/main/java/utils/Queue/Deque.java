package utils.Queue;

import utils.DNode;

public class Deque<E> implements Queue {

    private DNode front;
    private DNode rear;
    private int size;

    /**
     * front
     * prev : null
     * item : null
     * next : rear
     * <p>
     * rear
     * prev : front
     * item : null
     * next : null
     */
    public Deque() {
        front = new DNode(null, null, null);
        rear = new DNode(front, null, null);
        front.setNext(rear);
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public void addFirst(Object newItem) {
        DNode newNode = new DNode(null, newItem, front);
        front.setPrev(newNode);
        front = newNode;
        size++;
    }

    /**
     * addLast(Object newItem)와 동일
     *
     * @param newItem
     */
    public void add(Object newItem) {
        addLast(newItem);
    }

    public void addLast(Object newItem) {
        DNode newNode = new DNode(rear, newItem, null);
        rear.setNext(newNode);
        rear = newNode;
        size++;
    }

    /**
     * removeLast()와 동일
     *
     * @return
     */
    public Object remove() {
        return removeLast();
    }

    public Object removeLast() {
        rear = rear.getPrev();
        rear.setNext(null);
        size--;
        return rear.getItem();
    }
}

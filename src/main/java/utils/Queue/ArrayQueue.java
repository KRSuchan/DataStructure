package utils.Queue;

import java.util.NoSuchElementException;

public class ArrayQueue<E> implements Queue {
    E[] queue;
    int front;
    int rear;
    int size;

    public ArrayQueue() {
        this.queue = (E[]) new Object[2];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void add(Object newItem) {
        if ((rear + 1) % queue.length == front) resize(2 * queue.length);
        rear = (rear + 1) % queue.length;
        queue[rear] = (E) newItem;
        size++;
    }

    public E remove() {
        if (isEmpty()) throw new NoSuchElementException();
        front = (front + 1) % queue.length;
        E item = queue[front];
        queue[front] = null;
        size--;
        if (size > 0 && size == queue.length / 4) resize(queue.length / 2);
        return item;
    }

    public void resize(int newSize) {
        Object[] t = new Object[newSize];
        for (int i = 0, j = front + 1; i < size + 1; i++, j++) {
            t[i] = queue[j % queue.length];
        }
        front = 0;
        rear = size;
        queue = (E[]) t;
    }
}

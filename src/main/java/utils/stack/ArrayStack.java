package utils.stack;

import java.util.EmptyStackException;

public class ArrayStack<E> implements Stack{
    private E s[];
    private int top;

    public ArrayStack() {
        s = (E[]) new Object[1];
        top = -1;
    }

    public void push(Object newItem) {
        if (getSize() == s.length) resize(2*s.length);
        s[++top] = (E) newItem;
    }

    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        E item = s[top];
        s[top--] = null;
        if (getSize() > 0 && getSize() == s.length/4) resize(s.length/2);
        return item;
    }

    public E peek() {
        if (isEmpty()) throw new EmptyStackException();
        return s[top];
    }

    public void resize(int newSize) {
        E[] temp = (E[]) new Object[newSize];
        for (int i = 0; i < getSize(); i++) temp[i] = s[i];
        s = temp;
    }

    public int getSize() {
        return top+1;
    }
    public boolean isEmpty() {
        return (top == -1);
    }
}

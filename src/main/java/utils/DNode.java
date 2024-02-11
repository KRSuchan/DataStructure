package utils;

public class DNode<E> {
    private DNode<E> prev;
    private E item;
    private DNode<E> next;

    public DNode(DNode<E> prev, E item, DNode<E> next) {
        this.prev = prev;
        this.item = item;
        this.next = next;
    }

    public DNode<E> getPrev() {
        return prev;
    }

    public void setPrev(DNode<E> prev) {
        this.prev = prev;
    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public DNode<E> getNext() {
        return next;
    }

    public void setNext(DNode<E> next) {
        this.next = next;
    }
}

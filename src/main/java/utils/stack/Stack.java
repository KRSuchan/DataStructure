package utils.stack;

public interface Stack<E> {
    /**
     * 새로운 Item을 Parameter로 Stack에 추가
     */
    public void push(E e);

    /**
     * 배열의 마지막 Item을 return한다.
     * 마지막 Item은 삭제된다.
     */
    public E pop();

    /**
     * 배열의 마지막 Item을 return한다.
     */
    public E peek();
    /**
     * 현재 size를 Parameter로 2배의 size로 확장한다.
     */

    public void resize(int size);

    /**
     * 현재 size를 return한다.
     * return data type은 int
     */
    public int getSize();
}

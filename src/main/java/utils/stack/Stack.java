package utils.stack;

public interface Stack<E> {
    /**
     * 새로운 Item을 Parameter로 Stack에 추가
     */
    void push(E e);

    /**
     * 스택의 마지막 Item을 return한다.
     * 마지막 Item은 삭제된다.
     */
    E pop();

    /**
     * 스택의 마지막 Item을 return한다.
     */
    E peek();

    /**
     * 현재 size를 return한다.
     * return data type은 int
     */
    int getSize();
}

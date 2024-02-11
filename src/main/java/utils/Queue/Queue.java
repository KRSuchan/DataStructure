package utils.Queue;

public interface Queue<E> {
    /**
     * 큐의 크기 얻기
     */
    int getSize();

    /**
     * 큐가 비었는지 확인
     */
    boolean isEmpty();

    /**
     * 큐에 새 아이템 추가
     *
     * @param newItem
     */
    void add(E newItem);

    /**
     * 큐의 front 아이템 삭제
     */
    E remove();

}

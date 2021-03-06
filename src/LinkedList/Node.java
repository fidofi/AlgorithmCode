package LinkedList;

/**
 * Created by fido on 2018/2/12.
 * 链表节点
 */
public class Node<T> {
    private Node next;
    private T value;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

package homework2.task1;

import java.util.Iterator;

public class Node<T> {

    private final T element;
    private Node<T> prev;


    private Node<T> next;

    public Node(T element) {
        this.element = element;
    }

    public void newLinkPrev(Node<T> t){
        this.prev = t;
    }
    public void newLinkNext(Node<T> t){
        this.next = t;
    }
    public T getElement(){
        return element;
    }

    public boolean hasNext() {
        return next != null;
    }

    public Node<T> next() {
        return next;
    }
    public boolean hasPrev() {
        return prev() != null;
    }
    public Node<T> prev() {
        return prev;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node<?> node = (Node<?>) o;

        return element.equals(node.element);
    }

    @Override
    public int hashCode() {
        return element.hashCode();
    }
}

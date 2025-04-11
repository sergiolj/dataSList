package doubleLinkedList.collection;

import doubleLinkedList.interfaces.MyInterfaceDoubleLinkedList;
import doubleLinkedList.model.Node;

public class MyDoubleLinkedList <T> implements MyInterfaceDoubleLinkedList<T> {
    Node<T> head;
    Node<T> next;
    Node<T> previous;

    public MyDoubleLinkedList(Node<T> head, Node<T> next, Node<T> previous) {
        this.head = head;
        this.next = next;
        this.previous = previous;
    }

    @Override
    public boolean add(T element) {
        return false;
    }

    @Override
    public boolean remove(T element) {
        return false;
    }

    @Override
    public boolean contains(T element) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}

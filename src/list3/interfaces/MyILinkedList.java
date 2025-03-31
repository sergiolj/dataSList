package list3.interfaces;

import list3.model.Node;

public interface MyILinkedList <T> {

    boolean add(T element);
    boolean addAtBeginning(T element);
    void removeElement(T element);
    T removeLastAndGet();
    boolean removeLast();
    boolean remove(int index);
    boolean eraseAll();
    boolean isEmpty();
    int getSize();
    boolean containsElement(T element);
    int firstElementIndexOf(T element);

    boolean order();
}

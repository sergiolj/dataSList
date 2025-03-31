package list3.interfaces;

public interface MyILinkedList <T> {

    void add(T node);
    void removeElement(T node);
    T removeLastAndGet();
    boolean removeLast();
    boolean remove(int index);
    boolean eraseAll();
    boolean isEmpty();
    int getSize();
    boolean containsElement(T node);
    int firstElementIndexOf(T node);
}

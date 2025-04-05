package doubleLinkedList.interfaces;

public interface MyInterfaceDoubleLinkedList<T> {
    boolean add(T element);
    boolean remove(T element);
    boolean contains(T element);
    int size();
}

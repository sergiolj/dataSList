package list7.util;

public interface MyBinaryTreeInterface <T extends Comparable<T>> {
    void add(T data);
    void remove(T data);
    Node<T> retrieve(T data);
    boolean contains(T data);
    T minimum();
    T maximum();

    int size();
    boolean isEmpty();

    void preOrder();
    void inOrder();
    void postOrder();
}

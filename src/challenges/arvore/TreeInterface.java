package challenges.arvore;

public interface TreeInterface <T extends Comparable<T>>{

    boolean add(T element);
    T getRootData();
    boolean isEmpty();
    Node<T> search(Node<T> node, T element);
    Node<T> search(T element);
    boolean remove(T element);
    void preOrder();
    void inOrder();
    void postOrder();
    boolean clearAll();
}

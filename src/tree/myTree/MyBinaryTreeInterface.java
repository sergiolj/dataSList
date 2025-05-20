package tree.myTree;

public interface MyBinaryTreeInterface <T extends Comparable<T>> {
    void add(T data);
    void remove(T data);
    boolean contains(T data);
    T minimum();
    T maximum();

    int size();

    void preOrder();
    void inOrder();
    void postOrder();
}

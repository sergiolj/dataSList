package list7.refatorarMenu.collections;

public class Node <T>{
    private T data;
    private Node<T> left;
    private Node<T> right;

    public Node(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getLeft() {
        return this.left;
    }

    public Node<T> getRight() {
        return this.right;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "[" + this.data + "]";
    }
}

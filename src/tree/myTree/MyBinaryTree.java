package tree.myTree;

public class MyBinaryTree <T extends Comparable<T>> implements MyBinaryTreeInterface<T> {
    private Node<T> root;
    private int size;

    public MyBinaryTree() {
        this.root = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return root == null && size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T data) {
        this.root = addRec(root, data);
        size++;
    }

    private Node<T> addRec(Node<T> current, T data) {
        if(current == null) {
            return new Node<>(data);
        }
        //Always use data compareTo with getData() because this is the Comparable<T> pattern.
        int comparedData = data.compareTo(current.getData());

        if(comparedData < 0){
            current.setLeft(addRec(current.getLeft(), data));
        }else if(comparedData > 0){
            current.setRight(addRec(current.getRight(), data));
        }
        return current;
    }

    @Override
    public void remove(T data) {
        this.root = removeRec(root, data);
    }

    private Node<T> removeRec(Node<T> current, T data) {
        if(current == null) {
            return null;
        }
        /*
            Always use data compareTo with getData() because this is the Comparable<T> pattern.
            Comparable method compareTo result in tree different results:
            data = 5, getData(15) - > 5.compareTo(15) = -1
            if data == getData() -> 0
            if data < getData -> -1 // go to left subtree
            if data > getData -> 1 // go to right subtree
         */

        int comparedResult = data.compareTo(current.getData());

        if(comparedResult < 0) {
            current.setLeft(removeRec(current.getLeft(), data));
        }else if(comparedResult > 0){
            current.setRight(removeRec(current.getRight(), data));
        } else{

            if(current.getLeft() == null && current.getRight() == null) {
                return null;
            }

            if(current.getLeft() == null)  {
                return current.getRight();
            }

            if(current.getRight() == null)  {
                return current.getLeft();
            }
            T min = minimum(current.getRight());
            current.setData(min);
            current.setRight(removeRec(current.getRight(), min));
        }
        size--;
        return current;
    }

    @Override
    public boolean contains(T data) {
        if(isEmpty()) return false;
        return containsRec(root, data);
    }

    private boolean containsRec(Node<T> current, T data){
        if(current == null) {
            return false;
        }
        int comparedResult = data.compareTo(current.getData());

        if(comparedResult == 0){
            return true;
        }
        if(comparedResult < 0) {
            return containsRec(current.getLeft(), data);
        }
            return containsRec(current.getRight(), data);
    }

    /**
     * Retrieve the minimum value storage in a binary tree.
     * @return T data
     */
    @Override
    public T minimum() {
        return minimum(root);
    }

    /**
     * Retrieve the minimum value stored in the binary tree searching from a specific node.
     * @param current is the node to begin search
     * @return T data
     */
    private T minimum(Node<T> current) {
        while(current.getLeft() != null) {
            current = current.getLeft();
        }
        return current.getData();
    }

    /**
     * Retrieve the maximum value storage in a binary tree.
     * @return T data
     */
    @Override
    public T maximum() {
        return maximum(root);
    }

    /**
     * Retrieve the maximum value stored in a binary tree searching from a specific node.
     * @param current is the node to begin search
     * @return node
     */
    private T maximum(Node<T> current) {
        while(current.getRight() != null) {
            current = current.getRight();
        }
        return current.getData();
    }

    @Override
    public void preOrder() {
        preOrderRec(root);
        System.out.println();
    }

    /**
     * Pre Order visit node before its sons.
     * N -> left -> right
     * @param current is the node to begin search
     */
    private void preOrderRec(Node<T> current) {
        if(current != null) {
            System.out.println(current.getData() + " ");
            preOrderRec(current.getLeft());
            preOrderRec(current.getRight());
        }
    }

    @Override
    public void inOrder() {
        inOrderRec(root);
        System.out.println();
    }

    /**
     * In Order visit left, node and right.
     * In order means from left to right.
     * left -> N -> right
     * @param current is the node to begin search
     */
    private void inOrderRec(Node<T> current) {
        if(current != null) {
            preOrderRec(current.getLeft());
            System.out.println(current.getData() + " ");
            preOrderRec(current.getRight());
        }
    }


    @Override
    public void postOrder() {
        postOrderRec(root);
        System.out.println();
    }

    /**
     * Post Order visit left, right and then node.
     * In order means from that you visit the son's before the father node.
     * left -> right -> N
     * @param current is the node to begin search
     */
    private void postOrderRec(Node<T> current) {
        if(current != null) {
            postOrderRec(current.getLeft());
            postOrderRec(current.getRight());
            System.out.println(current.getData() + " ");
        }
    }
}

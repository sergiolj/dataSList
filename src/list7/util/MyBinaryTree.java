package list7.util;

/**
 * @author Sérgio Lopes Júnior
 * @author github.com/sergiolj

 * A generic binary tree implementation where each node contains an element,
 * and the tree structure satisfies the binary search property. The tree
 * supports operations such as adding, removing, retrieving elements,
 * traversals and finding minimum/maximum values.
 *
 * @param <T> the type of elements contained in the tree, which must implement the Comparable interface
 */
public class MyBinaryTree <T extends Comparable<T>> implements MyBinaryTreeInterface<T> {
    private Node<T> root;
    private int size;

    public MyBinaryTree() {
        this.root = null;
        this.size = 0;
    }

    /**
     * Checks whether the binary tree is empty. A binary tree is considered empty
     * if it has no elements, which means the root is null and the size is zero.
     *
     * @return true if the binary tree contains no elements, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return root == null && size == 0;
    }

    /**
     * Retrieves the number of elements currently stored in the binary tree.
     * The size represents the total count of nodes in the tree.
     *
     * @return the number of elements in the binary tree
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Adds an element to the binary tree. If the tree is empty, the data is added as the root
     * of the tree. Otherwise, the data is added in such a way as to maintain the binary tree property.
     *
     * @param data the data to be added to the binary tree
     */
    @Override
    public void add(T data) {
        this.root = addRec(root, data);
        size++;
    }

    /**
     * Recursively adds a new node containing the given data to the binary tree.
     * This method ensures the binary tree property is maintained by comparing
     * the data to be added with the data in the current node and traversing
     * either the left or right subtree as appropriate. If the current node
     * is null, a new node with the data is created and returned.
     *
     * @param current the current node being inspected in the binary tree
     *                during the recursive traversal
     * @param data the data to be inserted into the binary tree
     * @return the updated node of the binary tree after the data is added
     */
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

    /**
     * Removes an element from the binary tree. If the tree contains the specified data,
     * the corresponding node is deleted while maintaining the binary tree structure.
     * If the data is not found, the tree remains unchanged.
     *
     * @param data the data to be removed from the binary tree
     */
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
            if data < getData -> -1 // go to the left subtree
            if data > getData -> 1 // go to the right subtree
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

    /**
     * Retrieves a node containing the specified data from the binary tree.
     * Searches the binary tree for the node matching the given data input.
     * If the tree is empty or the data is not found, then it returns null.
     *
     * @param data the data to search for in the binary tree
     * @return the node containing the specified data, or null if not found or if the tree is empty
     */
    @Override
    public Node<T> retrieve(T data) {
        if(isEmpty()) return null;
        return retrieveRec(root, data);
    }

    /**
     * Recursively retrieves a node containing the specified data from the binary tree.
     * Compares the given data to the data in the current node and traverses the tree
     * by moving to the left or right subtree as necessary. If the node with the
     * matching data is found, it is returned. If the tree does not contain the data,
     * or if the tree is empty, then it returns null.
     *
     * @param current the current node being inspected in the binary tree
     * @param data the data being searched for in the binary tree
     * @return the node containing the specified data, or null if no such node exists
     */
    private Node<T> retrieveRec(Node<T> current, T data){
        if(current == null) {
            return null;
        }
        int comparedResult = data.compareTo(current.getData());

        if(comparedResult == 0){
            return current;
        }
        if(comparedResult < 0) {
            return retrieveRec(current.getLeft(), data);
        }
            return retrieveRec(current.getRight(), data);
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
     * @param current is the node used to begin the search.
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
     * @param current is the node used to begin the search.
     * @return node
     */
    private T maximum(Node<T> current) {
        while(current.getRight() != null) {
            current = current.getRight();
        }
        return current.getData();
    }

    /**
     * Performs a pre-order traversal of the binary tree starting from the root node.
     * The pre-order traversal visits nodes in the following order:
     * first visits the root (father) node, followed by the left subtree, and then the right subtree.
     * Make use of a recursive helper method to traverse the tree.
     */
    @Override
    public void preOrder() {
        preOrderRec(root);
    }

    /**
     * Pre-Order visits the father node before its sons.
     * Pre-order means you visit first the father node, then the left son node and finally the right son node.
     * N -> left -> right
     * @param current is the node to begin search.
     */
    private void preOrderRec(Node<T> current) {
        if(current != null) {
            System.out.println(current.getData() + " ");
            preOrderRec(current.getLeft());
            preOrderRec(current.getRight());
        }
    }

    /**
     * Performs an in-order traversal of the binary tree starting from the root node.
     * During an in-order traversal, the nodes are visited in the following order:
     * first the left subtree, then the root current node and finally the right subtree.
     * This method uses a recursive helper function to traverse the tree.
     */
    @Override
    public void inOrder() {
        inOrderRec(root);
    }

    /**
     * In Order visits left, father node and right node.
     * In order means you visit first the left node, then the father node and finally the right node.
     * Left -> N -> right
     * @param current is the node to begin search.
     */
    private void inOrderRec(Node<T> current) {
        if(current != null) {
            preOrderRec(current.getLeft());
            System.out.println(current.getData() + " ");
            preOrderRec(current.getRight());
        }
    }

    /**
     * Performs a post-order traversal of the binary tree starting from the root node.
     * In a post-order traversal, the nodes are visited in the following order:
     * first the left subtree, then the right subtree, and finally the root (current node).
     * This method uses a recursive helper function to traverse the tree.
     */
    @Override
    public void postOrder() {
        postOrderRec(root);
    }

    /**
     * The post-Order visits left, right and then the father's node.
     * The post-Order means that you will visit both sons before the father's node.
     * Left -> right -> N
     * @param current is the node used to begin the search.
     */
    private void postOrderRec(Node<T> current) {
        if(current != null) {
            postOrderRec(current.getLeft());
            postOrderRec(current.getRight());
            System.out.println(current.getData() + " ");
        }
    }

    /**
     * Performs a pre-order traversal starting from the given data node,
     * which includes visiting the father node before its left and right subtrees.
     * If the node corresponding to the given data is not found, no action is taken.
     *
     * @param data the data used to find the initial node (father) in the binary tree
     */
    public void fatherAndSons(T data) {
        Node<T> father = retrieve(data);
        if(father != null) {
            preOrderRec(father);
        }
    }

    /**
     * Displays only the leaf nodes of the binary tree. A leaf node is defined as a node
     * that does not have any child nodes (both left and right children are null).
     * If the binary tree is empty, this method performs no action.

     * This method makes use of a recursive helper function {@code leafsOnlyRec} to traverse
     * the binary tree and identify the leaf nodes.
     */
    public void leafsOnly() {
        if(!isEmpty()){
            leafsOnlyRec(root);
            }
    }

    /**
     * Recursively traverses a binary tree and prints the data of all leaf nodes.
     * A leaf node is defined as a node with no child nodes (both left and right are null).
     *
     * @param current the current node being inspected during the recursive traversal
     */
    private void leafsOnlyRec(Node<T> current) {
        if(current != null) {
            if (current.getLeft() == null && current.getRight() == null) {
                System.out.println(current.getData() + " ");
            }
            leafsOnlyRec(current.getLeft());
            leafsOnlyRec(current.getRight());
        }
    }

    /**
     * Checks whether the binary tree contains the specified data.
     * This method leverages the helper function {@code containsRec} to
     * perform a recursive search starting from the root node.
     * If the tree is empty, then it immediately returns false.
     *
     * @param data the data to search for within the binary tree
     * @return true if the binary tree contains the specified data, false otherwise
     */
    @Override
    public boolean contains(T data) {
        if(isEmpty()) return false;
        return containsRec(root, data);
    }

    /**
     * Recursively checks whether the given data is contained within the binary tree starting from the specified node.
     * Compares the provided data with the data stored in the current node and traverses the left or right subtree as
     * needed.
     *
     * @param current the current node being inspected during the recursive traversal of the binary tree
     * @param data the data to search for within the binary tree
     * @return true if the binary tree contains the specified data, false otherwise
     */
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
}

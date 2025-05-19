package challenges.arvore;

public class BinaryTree <T extends Comparable<T>> implements TreeInterface<T> {
    private Node<T> root;

    public BinaryTree() {
        this.root = null;
    }

    @Override
    public boolean add(T element) {
        if(isEmpty()) {
            addRoot(element);
            return this.root != null;
        }
        return addRecursively(this.root, element);
    }

    private void addRoot(T element) {
            Node<T> newNode = new Node<>(element);
            newNode.setLeft(null);
            newNode.setRight(null);
            this.root = newNode;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public T getRootData() {
        if(isEmpty()) {
            return null;
        }
        return this.root.getData();
    }

    private boolean addRecursively(Node<T> current, T element) {
        if (element.compareTo(current.getData()) < 0) {
            if (current.getLeft() == null) {
                current.setLeft(new Node<>(element));
                return true;
            } else {
                return addRecursively(current.getLeft(), element);
            }
        } else if (element.compareTo(current.getData()) > 0) {
            if (current.getRight() == null) {
                current.setRight(new Node<>(element));
                return true;
            } else {
                return addRecursively(current.getRight(), element);
            }
        } else {

            return false;
        }
    }

    /**
     * Esses métodos não podem ser utilizados automaticamente para o caso de criação de árvores que tenham mais de dois
     * níveis, pois os dados do elemento pai devem ser conhecidos.
     * @param elementFather
     * @param elementSon
     * @return
     */
    public boolean addLeft(T elementFather, T elementSon) {
        Node<T> nodeSon = search(elementSon);
        if(nodeSon != null){
            return false;
        }
        Node<T> nodeFather = search(elementFather);
        if(nodeFather == null){
            return false;
        }
        if(nodeFather.getLeft() != null){
            return false;
        }
        Node<T> newNode = new Node<>(elementSon);
        newNode.setLeft(null);
        newNode.setRight(null);
        nodeFather.setLeft(newNode);
        return true;
    }

    /**
     * Esses métodos não podem ser utilizados automaticamente para o caso de criação de árvores que tenham mais de dois
     * níveis, pois os dados do elemento pai devem ser conhecidos.
     * @param elementFather
     * @param elementSon
     * @return
     */
    public boolean addRight(T elementFather, T elementSon) {
        Node<T> nodeSon = search(elementSon);
        if(nodeSon != null){
            return false;
        }
        Node<T> nodeFather = search(elementFather);
        if(nodeFather == null){
            return false;
        }
        if(nodeFather.getRight() != null){
            return false;
        }
        Node<T> newNode = new Node<>(elementSon);
        newNode.setLeft(null);
        newNode.setRight(null);
        nodeFather.setRight(newNode);
        return true;
    }

    @Override
    public Node<T> search(Node<T> node, T element) {
        if(node == null) {
            return null;
        }
        if(node.getData().equals(element)) {
            return node;
        }
        Node<T> auxNode = search(node.getLeft(), element);
        if(auxNode == null) {
            auxNode = search(node.getRight(), element);
        }
        return auxNode;
    }

    public Node<T> search(T element) {
        if(isEmpty()) {
            return null;
        }
        return search(root, element);
    }

    @Override
    public boolean remove(T element) {
        return false;
    }

    private void preOrder(Node<T> node){
            if(node == null){
                return;
            }
            System.out.print(node.getData() + " ");

            if(node.getLeft() != null){
                preOrder(node.getLeft());
            }

            if(node.getRight() != null){
                preOrder(node.getRight());
            }
    }

    private void centerOrder(Node<T> node){
        if(node == null){
            return;
        }

        if(node.getLeft() != null){
            centerOrder(node.getLeft());
        }
        System.out.print(node.getData() + " ");

        if(node.getRight() != null){
            centerOrder(node.getRight());
        }
    }

    private void postOrder(Node<T> node){
        if(node == null){
            return;
        }

        if(node.getLeft() != null){
            postOrder(node.getLeft());
        }

        if(node.getRight() != null){
            postOrder(node.getRight());
        }
        System.out.print(node.getData() + " ");
    }

    @Override
    public void preOrder() {
        if(!isEmpty()){
            preOrder(this.root);
            System.out.println();
        }else {
            System.out.println("Empty Tree");
        }
    }

    @Override
    public void inOrder() {
        if(!isEmpty()){
            centerOrder(this.root);
            System.out.println();
        }else {
            System.out.println("Empty Tree");
        }
    }

    @Override
    public void postOrder() {
        if(!isEmpty()){
           postOrder(this.root);
            System.out.println();
        }else {
            System.out.println("Empty Tree");
        }
    }

    @Override
    public boolean clearAll() {
        this.root = null;
        return true;
    }

}

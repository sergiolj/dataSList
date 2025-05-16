package tree;

public class BinaryTree <T> implements TreeInterface <T> {
    private Node<T> root;

    public BinaryTree() {
        this.root = null;
    }

    @Override
    public void add(T element) {
        if(!isEmpty()){
            Node<T> newNode = new Node<>(element);
            newNode.setLeft(null);
            newNode.setRight(null);

        }
    }

    @Override
    public boolean addRoot(T element) {
        if(isEmpty()){
            Node<T> newNode = new Node<>(element);
            newNode.setLeft(null);
            newNode.setRight(null);
            this.root = newNode;
            return true;
        }else{
            return false;
        }
    }
    @Override
    public boolean isEmpty() {
        return root == null;
    }

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
        nodeFather.setRight(newNode);
        return true;
    }

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
        nodeFather.setLeft(newNode);
        return true;
    }
public void showPreOrder(Node<T> node){
        if(node == null){
            return;
        }
        if(node.getLeft() != null){
            showPreOrder(node.getLeft());
        }
        if(node.getRight() != null){
            showPreOrder(node.getRight());
        }
    System.out.println(" " + node.getData());
}

    public void showPreOrder(){
        if(isEmpty()){
            System.out.println("Empty Tree");
        }else{
            showPreOrder(root);
        }
    }

    public Node<T> search(Node<T> node, T element) {
        if(node == null) {
            return null;
        }
        if(node.getData()==element) {
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


}

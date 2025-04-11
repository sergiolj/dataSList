package simuladoAV1.collections.LinkedL;

public class LinkedList <T> implements InterfaceLinkedList <T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return size == 0 && head == null;
    }

    @Override
    public boolean add(T element) {
        if (isEmpty()) {
            addFirst(element);
            return true;
        }else{
            Node<T> newNode = new Node<>(element);
            this.tail.setNext(newNode);
            this.tail = newNode;
            size++;
            return true;
        }
    }

    private void addFirst(T element) {
        Node<T> newNode = new Node<>(element);
        this.head = newNode;
        this.tail = newNode;
        this.size++;
        return;
    }

    @Override
    public boolean remove() {
        if (isEmpty()) {
            System.out.println("Incapaz de remover, lista vazia");
            return false;
        }
        if (this.head == this.tail) {
            this.head = null;
            this.tail = null;
            this.size--;
            return true;
        }
        Node<T> current = this.head;
        while (current.getNext() != tail) {
            current = current.getNext();
        }
        current.setNext(null);
        this.tail = current;
        this.size--;
        return true;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            System.out.println("Lista vazia");
            return "[]";
        }
    StringBuilder str = new StringBuilder("{");
    Node<T> current = head;
    while (!current.equals(tail)) {
        str.append(current.getData()).append(", ");
        current = current.getNext();
    }
    str.append(current.getData());
    str.append("}");
    return str.toString();
    }
}

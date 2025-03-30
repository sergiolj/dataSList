package avaliacao;

public class Node {
    private Integer element;
    private Node next;

    public Node(Integer element, Node next) {
        this.element = element;
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Integer getElement() {
        return element;
    }
    @Override
    public String toString() {
        return "Node [element=" + element + "]";
    }
}
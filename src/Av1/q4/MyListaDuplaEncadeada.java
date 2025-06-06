package Av1.q4;

public class MyListaDuplaEncadeada<T>  implements ListaDuplaInterface<T> {
    private NodeD<T> head;
    private NodeD<T> tail;
    private int size=0;

    public MyListaDuplaEncadeada() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null && size==0;
    }

    @Override
    public boolean adicionarInicio(T elemento) {
        if(isEmpty()){
            addAtBeginnig(elemento);
            return true;
        }else{
            NodeD<T> newNode = new NodeD<>(elemento);
            newNode.setNext(head);
            this.head.setPrev(newNode);
            this.head = newNode;
            size++;
        }
        return true;
    }

    private void addAtBeginnig(T elemento) {
        NodeD<T> newNode = new NodeD<>(elemento);
        this.tail = newNode;
        this.head = newNode;
        size++;
    }

    @Override
    public boolean removerFim() {
        if(isEmpty()){
            System.out.println("Impossível remover, lista vazia");
            return false;
        }
        if(head == tail){
            this.head = null;
            this.tail = null;
            size--;
            return true;
        }
        this.tail = tail.getPrev();
        this.tail.setNext(null);
        size--;
        return true;
    }

    @Override
    public String toString() {
        if(isEmpty()){
            return "{}";
        }
        StringBuilder str = new StringBuilder("{");
        NodeD<T> current = head;
        while (!current.equals(tail)){
            str.append(current.getData()).append(", ");
            current = current.getNext();
        }
        str.append(current.getData()).append("}");
        return str.toString();
    }
}

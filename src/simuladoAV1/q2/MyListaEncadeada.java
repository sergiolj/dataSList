package simuladoAV1.q2;

public class MyListaEncadeada <T>  implements ListaEncadeadaInterface<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size=0;

    public MyListaEncadeada() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null && size==0;
    }

    @Override
    public boolean adicionar(T elemento) {
        if(isEmpty()){
            addAtBeginnig(elemento);
            return true;
        }else{
            Node<T> newNode = new Node<>(elemento);
            this.tail.setNext(newNode);
            this.tail = newNode;
            size++;
        }
        return true;
    }

    private void addAtBeginnig(T elemento) {
        Node<T> newNode = new Node<>(elemento);
        this.tail = newNode;
        this.head = newNode;
        size++;
    }

    @Override
    public boolean remover() {
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
        Node<T> current = head;
        while (current.getNext() != tail) {
            current = current.getNext();
        }
        current.setNext(null);
        this.tail = current;
        size--;
        return true;
    }

    @Override
    public String toString() {
        if(isEmpty()){
            return "{}";
        }
        StringBuilder str = new StringBuilder("{");
        Node<T> current = head;
        while (!current.equals(tail)){
            str.append(current.getData()).append(", ");
            current = current.getNext();
        }
        str.append(current.getData()).append("}");
        return str.toString();
    }
}

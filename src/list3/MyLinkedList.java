package list3;

import list3.interfaces.MyILinkedList;

public class MyLinkedList <T> implements MyILinkedList <T> {
    private Node<T> head;
    private Node<T> tail;
    private int count = 0;

    private void addToBeginning(T element) {
        Node<T> newNode = new Node<T>(element, null);
        this.head = newNode;
        this.tail = newNode;
        count++;
    }

    @Override
    public void add(T element) {
        if (count == 0) {
            addToBeginning(element);
        } else {
            Node<T> newNode = new Node<T>(element);
            this.tail.setNext(newNode);
            this.tail = newNode;
            count++;
        }
    }

    @Override
    public void removeElement(T element) {
        int index = firstElementIndexOf(element);
        if (index != -1) {
            remove(index);
        } else {
            System.out.println("Element not found");
        }
    }

    @Override
    public boolean removeLast() {
        if (head == null) {
            return false;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node<T> current = head;
            while (current.getNext() != this.tail) {
                current = current.getNext();
            }
            this.tail = current;
            current.setNext(null);
        }
        count--;
        return true;
    }

    @Override
    public T removeLastAndGet() {
        if (head == null) {
            return null;
        }
        Node<T> removed = head;
        if (head == tail) {
            head = null;
            tail = null;
            count--;
            return removed.getElement();
        }
        Node<T> current = head;
        while (current.getNext() != this.tail) {
            removed = current;
            current = current.getNext();
        }
        this.tail = current;
        current.setNext(null);
        count--;
        return removed.getElement();
    }

    @Override
    public boolean remove(int index) {
        if(isValidRange(index)){
            int currentIndex = 0;
            Node<T> current = head;
            Node<T> previous = head;
            if(index == 0){
                this.head = current.getNext();
                this.tail = current;
                count--;
                return true;
            }else{
                while(currentIndex != index - 1){
                    current = current.getNext();
                    currentIndex++;
                }
                previous.setNext(current.getNext());
                count--;
            }
        }
        System.out.println("Erro. Índice inválido.");
        return false;
    }

    boolean isValidRange(int index){
        return index >= 0 && index < count;
    }

    @Override
    public boolean eraseAll() {
        if(!isEmpty()){
            this.head.setNext(null);
            this.head = null;
            count = 0;
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int getSize() {
        return count;
    }

    @Override
    public boolean containsElement(T node) {
        Node<T> current = head;
        do {
            if (current.getElement().equals(node)) {
                return true;
            } else {
                current = current.getNext();
            }
        }while (current != null);
        return false;
    }

    @Override
    public int firstElementIndexOf(T node) {
        int index = 0;
        Node<T> current = head;
        do {
            if (current.getElement().equals(node)) {
                return index;
            } else {
                current = current.getNext();
                index++;
            }
        }while (current != null);
        return -1;
    }

    @Override
    public String toString() {
        if(isEmpty()){
            return "{}";
        }
        StringBuilder strb = new StringBuilder("{");
        Node<T> current = head;
        while(current.getNext() != null){
            strb.append(current.getElement());
            strb.append(",");
            current = current.getNext();
        }
        strb.append(current.getElement());
        strb.append("}");
        return strb.toString();
    }
}

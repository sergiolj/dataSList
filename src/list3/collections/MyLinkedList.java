package list3.collections;

import list3.interfaces.MyILinkedList;
import list3.model.Node;

public class MyLinkedList <T> implements MyILinkedList <T> {
    private Node<T> head;
    private Node<T> tail;
    private int count = 0;

    private boolean addToBeginning(T element) {
        Node<T> newNode = new Node<T>(element, null);
        this.head = newNode;
        this.tail = newNode;
        count++;
        return true;
    }

    @Override
    public boolean add(T element) {
        if(element == null) {
            return false;
        }
        if (count == 0) {
            return addToBeginning(element);
        } else {
            Node<T> newNode = new Node<T>(element);
            this.tail.setNext(newNode);
            this.tail = newNode;
            count++;
            return true;
        }
    }

    @Override
    public boolean addAtBeginning(T element) {
        Node<T> newNode = new Node<T>(element, this.head);
        this.head = newNode;
        count++;
        return true;
    }

    @Override
    public void removeElement(T element) {
        int index = firstElementIndexOf(element);
        if (index != -1) {
            remove(index);
            count--;
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

    public boolean isValidRange(int index){
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
        String searchedElement = node.toString().toLowerCase();
        do {
            if (String.valueOf(current.getElement()).toLowerCase().equals(searchedElement)) {
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
        String searchedElement = node.toString().toLowerCase();
        do {
            if (String.valueOf(current.getElement()).equals(searchedElement)) {
                return index;
            } else {
                current = current.getNext();
                index++;
            }
        }while (current != null);
        return -1;
    }

    @Override
    public boolean order() {
        return false;
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

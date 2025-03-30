package avaliacao;

public class MyList implements avaliacao.interfaces.MyLinkedList {
    private Node head;
    private Node tail;
    private int count = 0;

    private boolean addAtBeginning (Integer number){
        Node newNode = new Node(number, head);
        this.head = newNode;
        if (count == 0){
            this.tail = newNode;
        }
        count++;
        return true;
    }

    @Override
    public boolean add(Integer number) {
        if (count == 0){
            addAtBeginning(number);
        }else{
            Node newNode = new Node (number, null);
            this.tail.setNext(newNode);
            this.tail = newNode;
            count++;
        }
        return true;
    }

    public boolean verify(Integer number){
        int val = (Integer) number;
        if (val <= 0){
            return false;
        }
        return val % 2 == 0;
    }

    @Override
    public void remove() {
        if (count == 0){
            System.out.println("A lista está vazia!");
            return;
        }
        if (count == 1){
            head = null;
            tail = null;
        }else{
            Node current = head;
            while (current.getNext() != tail){
                current = current.getNext();
            }
            current.setNext(null);
            tail = current;
        }
        count--;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[");
        Node current = this.head;
        while(current != null){
            str.append(current.getElement());
            if(current.getNext() != null){
                str.append(", ");
            }
            current = current.getNext();
        }
        str.append("]");
        return str.toString();
    }
}

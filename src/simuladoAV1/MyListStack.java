package simuladoAV1;

public class MyListStack <T> implements MyListInterface <T>{
    private Node<T> head;
    private Node<T> tail;
    private int size=0;

    public MyListStack(){
        head = null;
        tail = null;
        size=0;
    }

    @Override
    public boolean isEmpty(){
        return size==0 && head==null;
    }

    @Override
    public int indexOf(T object) {
        if(isEmpty()){
            System.out.println("List is empty");
            return -1;
        }
        int currentPosition = 0;
        Node<T> current = head;
        while(current!=null){
            if(current.getData().equals(object)){
                return currentPosition;
            }
            current = current.getNext();
            currentPosition++;
        }
        return -1;
    }

    @Override
    public boolean remove(T object) {
        if(isEmpty()){
            System.out.println("List is empty");
            return false;
        }
        int positionToRemove = indexOf(object);
        if(positionToRemove==-1){
            System.out.println("Object not found");
            return false;
        }
        if(positionToRemove==0){
            head = head.getNext();
            size--;
            return true;
        }
        if(positionToRemove==size-1){
            remove();
            return true;
        }
        Node<T> current = get(positionToRemove);
        Node<T> previous = get(positionToRemove-1);
        previous.setNext(current.getNext());
        current.setNext(null);
        size--;
        return true;
    }

    @Override
    public boolean clearAll() {
        if(isEmpty()){
            System.out.println("List is empty");
            return false;
        }
        this.head = null;
        size=0;
        return true;
    }

    private boolean addAtBeginning(T object){
        Node<T> newNode = new Node<>(object);
        this.head = newNode;
        this.tail = newNode;
        this.tail.setNext(null);
        size++;
        return true;
    }

    @Override
    public boolean add(T object) {
        Node<T> newNode = new Node<>(object);
        if(isEmpty()){
            return addAtBeginning(object);
        }
        newNode.setNext(null);
        this.tail.setNext(newNode);
        this.tail = newNode;
        size++;
        return true;
    }

    @Override
    /*
     O remove tem que percorrer a lista até que o próximo do nó current seja o tail, ou seja, até o penultimo elemento.
     */
    public boolean remove() {
        if(isEmpty()){
            System.out.println("Unable to remove element, list is empty");
            return false;
        }
        if(head==tail){
            head = null;
            tail = null;
            size--;
            return true;
        }
        Node<T> current = this.head;
        while(current.getNext()!=tail){
            current = current.getNext();
        }
        current.setNext(null);
        this.tail = current;
        size--;
        return true;
    }

    @Override
    /*
    Contains precisa testar até o último elemento, por isso a condição é que pare apenas quando o
    nó current seja nulo
     */
    public boolean contains(T object) {
        if(isEmpty()){
            System.out.println("Unable to find element, list is empty");
            return false;
        }
        Node<T> current = this.head;
        while(current!=null){
            if(current.getData().equals(object)){
                return true;
            }else{
                current = current.getNext();
            }
        }
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Node<T> get(int index) {
        if(isEmpty()){
            System.out.println("Unable to find element, list is empty");
            return null;
        }
        int currentPosition = 0;
        Node<T> current = this.head;
        while(current!=null){
            if(currentPosition==index){
                return current;
            }
            current = current.getNext();
            currentPosition++;
        }
        return null;
    }

    @Override
    /*
    Nesse caso para que a vírgula do último elemento não seja adicionada devemos percorrer a lista enquanto o elemento
    não for o tail para adicionar o tail fora da iteração.
     */
    public String toString() {
        if(isEmpty()){
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Node<T> current = head;
        while(current!=tail){
            sb.append(current.getData()).append(", ");
            current = current.getNext();
        }
        sb.append(current.getData());
        sb.append("}");
        return sb.toString();
    }
}

package simuladoAV1;

public interface MyListInterface <T>  {
    boolean add(T object);
    boolean remove();
    boolean contains(T object);
    int size();
    Node<T> get(int index);
    boolean isEmpty();
    int indexOf(T object);
    boolean remove(T object);
    boolean clearAll();
}

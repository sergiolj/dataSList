package list1.tadExerc.interfaces;

public interface IMyQueue<T> {
    boolean isEmpty();
    int size();
    T peek();
    T remove();
    T poll( T obj);
    T peekFirst();
}

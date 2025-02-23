package list1.tadExerc.interfaces;

public interface IMyList <T> {
    boolean add(T obj);
    T get(int index);
    T remove(int index);
    boolean contains(T obj);
    boolean update(T obj);
    T remove(T obj);
    void remove();
}

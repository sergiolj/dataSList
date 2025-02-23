package list1.tests;

public interface InterfaceMyStack <T> {
    boolean add(T t);
    boolean remove(T t);
    boolean contains(T t);
    boolean remove();
    boolean update(T t);
    T getT(int index);
    T getT(T t);
    void autoIncreaseSize();
    void autoDecreaseSize();
    int getSize();
}

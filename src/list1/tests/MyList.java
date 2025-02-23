package list1.tests;

import java.util.Arrays;

public class MyList<T> implements InterfaceMyStack <T> {
    private static int size = 0;
    private static final int INITIAL_CAPACITY = 5;
    private T [] list;

    @SuppressWarnings("unchecked")
    public MyList() {
        this.list = (T[]) new Object[INITIAL_CAPACITY];
    }

    @Override
    public boolean add(T t) {
        autoIncreaseSize();
        list[size] = t;
        size++;
        return true;
    }

    @Override
    public boolean remove(T t) {
        return false;
    }

    @Override
    public boolean contains(T t) {
        return false;
    }

    @Override
    public boolean remove() {
        if (size != 0){
            size--;
            list[size] = null;
            }else{
            list[size] = null;
            return true;
        }
            return false;
    }

    @Override
    public boolean update(T t) {
        return false;
    }

    @Override
    public T getT(int index) {
        return null;
    }

    @Override
    public T getT(T t) {
        return null;
    }

    @Override
    public void autoIncreaseSize() {
        if(list.length == size) {
            list = Arrays.copyOf(list, list.length * 2);
        }

    }

    @Override
    public void autoDecreaseSize() {
        if(list.length/size < 2) {
            list = Arrays.copyOf(list, list.length / 2);
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return list.length;
    }

    @Override
    public String toString() {
        return "StudentsList{"+ Arrays.toString(list)+"}";
    }
}

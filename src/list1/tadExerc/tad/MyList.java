package list1.tadExerc.tad;

import list1.tadExerc.interfaces.IMyList;

public class MyList <T> implements IMyList<T> {
    @Override
    public boolean add(T obj) {
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public boolean contains(T obj) {
        return false;
    }

    @Override
    public boolean update(T obj) {
        return false;
    }

    @Override
    public T remove(T obj) {
        return null;
    }

    @Override
    public void remove() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}

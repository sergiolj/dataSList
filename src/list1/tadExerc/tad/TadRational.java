package list1.tadExerc.tad;

import list1.tadExerc.interfaces.RationalData;

public class TadRational<T> implements RationalData<T> {

    @Override
    public double create(T obj) {
        return 0;
    }

    @Override
    public double sum() {
        return 0;
    }

    @Override
    public double multiply() {
        return 0;
    }

    @Override
    public boolean isEqual(T obj1, T obj2) {
        return false;
    }
}

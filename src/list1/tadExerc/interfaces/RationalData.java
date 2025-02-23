package list1.tadExerc.interfaces;

public interface RationalData <T> {
    double create(T obj);
    double sum();
    double multiply();
    boolean isEqual(T obj1, T obj2);

}

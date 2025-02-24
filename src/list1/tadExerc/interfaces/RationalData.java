package list1.tadExerc.interfaces;

import list1.tadExerc.models.RationalNumber;

public interface RationalData {
    double create(RationalNumber number);
    double sum();
    double multiply();
    boolean isEqual(RationalNumber number, RationalNumber otherNumber);

}

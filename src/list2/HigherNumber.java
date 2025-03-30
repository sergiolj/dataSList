package list2;
/*
 * 14 – Implemente uma função recursiva que encontre o maior elemento dentro de um array de inteiros.
 */

import list2.util.ArrayInt;

public class HigherNumber {
    ArrayInt array;

    public HigherNumber(ArrayInt array) {
        this.array = array;
    }

    public int getHigherNumber() {
        int higher = 0;
        for (int i = 0; i < array.getSize(); i++) {
            if (array.getArray()[i] > higher) {
                higher = array.getArray()[i];
            }
        }
        return higher;
    }

    private int verifyHigherNumberRec(int higher, int i) {
        if (i == 0) return higher;
        if (higher < array.getArray()[i]) {
            higher = array.getArray()[i];
        }
        return verifyHigherNumberRec(higher, i - 1);
    }

    public int getHigherNumberRec() {
        int higher  = array.getArray()[0];
        int i = array.getSize() - 1;
        return verifyHigherNumberRec(higher, i);
    }

    private int verifyHigherNumberGPT(int i) {
        if (i == 0) return array.getArray()[0];
        return Math.max(array.getArray()[i], verifyHigherNumberGPT(i - 1));
    }

    public int getHigherNumberGPT() {
        return verifyHigherNumberGPT(array.getSize()-1);
    }
}

package list2;
/*
 * 12 – Crie uma função recursiva que calcule a soma dos elementos de um array de inteiros.
 */

import list2.util.ArrayInt;

public class SumArrayInt {
    ArrayInt array;

    public SumArrayInt(ArrayInt array) {
        this.array = array;
    }

    public int sum() {
        int sum = 0;
        for(int num: array.getArray()) {
            sum += num;
        }
        return sum;
    }

    private int sumRecCall(int next){
        if(next == array.getSize()) {
            return 0;
        }
        return array.getArray()[next] + sumRecCall(next+1);
    }

    public int sumRec(){
        return sumRecCall(0);
    }
}

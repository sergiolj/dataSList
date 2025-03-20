package list2;
/*
 * 12 – Crie uma função recursiva que calcule a soma dos elementos de um array de inteiros.
 */

import java.util.Random;

public class ArrayInt {
    private int[] array;
    private int size;
    private int random;

    public ArrayInt(int size, int random) {
        this.random = random;
        this.size = size;
        this.array = new int[size];
        autoComplete();
    }

    public void printVector() {
        int i=0;
        System.out.print("[");
        while(i < array.length-1) {
            System.out.print(array[i] + ",");
            i++;
        }
        System.out.println(array[array.length-1]+ "]");
    }

    private void autoComplete() {
        Random rand = new Random();
        for(int i = 0; i < size; i++) {
            array[i] = rand.nextInt(random);
        }
    }
    public int sum() {
        int sum = 0;
        for(int num: array) {
            sum += num;
        }
        return sum;
    }

    private int sumRecCall(int next){
        if(next == array.length) {
            return 0;
        }
        return array[next] + sumRecCall(next+1);
    }

    public int sumRec(){
        return sumRecCall(0);
    }
}

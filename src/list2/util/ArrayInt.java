package list2.util;

import java.util.Arrays;
import java.util.Random;

public class ArrayInt {
    private final int[] array;
    private final int size;
    private final int random;

    public ArrayInt(int size, int random) {
        this.random = random;
        this.size = size;
        this.array = new int[size];
        autoComplete();
    }

    public int[] getArray() {
        return array;
    }

    public int getSize() {
        return size;
    }

    private void autoComplete() {
        Random rand = new Random();
        for(int i = 0; i < size; i++) {
            array[i] = rand.nextInt(random);
        }
    }
    public void displayElements() {
        int i=0;
        System.out.print("[");
        while(i < array.length-1) {
            System.out.print(array[i] + ",");
            i++;
        }
        System.out.println(array[array.length-1]+ "]");
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}

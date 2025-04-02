package list3.util;

import list3.model.Node;

public class LinearRecursiveSearch <T>{

    private int linearSearch(Node<T> node, Node<T> search, int index) {
        return -1;
    }

    public static void search(int[] array, int target) {

    }

    private static void output(int output){
        if(output == -1) {
            System.out.println("\nNúmero não localizado.");
        }else{
            System.out.println("\nNúmero localizado no índice " + output);
        }
    }
}

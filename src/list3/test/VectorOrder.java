package list3.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VectorOrder {

    public static void main(String[] args) {
        int[] nums = new int[]{9, 3, 8, 1, 2, 7};
        bubbleSort(nums);
    }

    private static void arrayPrint(int[] array) {
        for(Integer i : array) {
            System.out.print(i+", ");
        }
        System.out.println();
    }

    public static void order() {
        String[] list = new String[]{"Maria Ana", "Pedro", "Paulo", "Joao", "Maria Beatriz", "Ana", "Beatriz", "Cristina"};
        List<String> list1 = new ArrayList<>(List.of(list));
        Collections.sort(list1);
        list1.forEach(System.out::println);
    }

    public static void bubbleSort(int[] array) {
        boolean sorted;
        int n = array.length;
        arrayPrint(array);
        System.out.println("Sorted array using bubble Sort\n");
        //O primeiro loop garante que o maior número será colocado na última posição e a cada
        //nova iteração o segundo maior será empurrado para o final da lista e assim sucessivamente
        for (int i = 0; i < n - 1; i++) {
            sorted = false;

            //O segundo loop testa os pares lado a lado e como a cada iteração controlada pelo primeiro loop
            //um número é posicionado corretamente no final não é mais necessário testar aquele último número
            //tornando a iteração uma vez menor a cada loop, por isso j < (n-1) - (i).
            for (int j = 0; j < n -1 - i; j++) {
                if (array[j] > array[j+1]) {
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                    sorted = true;
                }
            }
            arrayPrint(array);
            if (!sorted) {
                break;
            }
        }

    }
}

package list2;

/**
 * 5 - Escreva uma função recursiva que imprima todos os números inteiros de 1 até n, onde n é um
 * número inteiro positivo fornecido como entrada.
 */

public class Count {

    public void printList(int n) {
        System.out.print("[");
        for (int i = 1; i < n; i++) {
            System.out.print(i + ",");
        }
        System.out.println(n + "]");
    }

    private String prtListRec(int n) {
        if (n == 1) {
            return "[1";
        }
        return prtListRec(n - 1) + ("," + n);
    }

    private String prtListRecTernary(int n) {
        return (n == 1) ? "[1": prtListRecTernary(n - 1) + ("," + n) ;
    }

    public String getList(int n) {
        return prtListRecTernary(n) + "]";
        //return prtListRec(n) + "]";
    }
}

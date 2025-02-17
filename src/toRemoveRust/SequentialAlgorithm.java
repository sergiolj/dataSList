package toRemoveRust;

import java.util.Scanner;

public class SequentialAlgorithm extends Operand {
    Scanner sc = new Scanner(System.in);
    private int n1 = 0, n2 = 0;
    private String title;


    public void sequence() {
        title = "\nSequential Algorithm (x) < (y)";
        selectRange(title);
        System.out.print("[");
        for (int i = n1; i <= n2; i++) {
            if (i == n2) {
                System.out.print(i);
            } else {
                System.out.print(i + ",");
            }
        }
        System.out.print("]\n");
    }

    public void pares() {
        title = "\nPairs Algorithm (x) < (y)";
        selectRange(title);
        adjustToPair();

        System.out.print("[");
        for (int i = n1; i <= n2; i = i + 2) {
            if (i != n2) {
                System.out.print(i + ",");
            } else {
                System.out.print(i);
            }
        }
        System.out.println("]");
    }

    public void impairs() {
        title = "\nImpairs Algorithm (x) < (y)";
        selectRange(title);
        adjustToImpair();

        System.out.print("[");
        for (int i = n1; i <= n2; i = i + 2) {
            if (i != n2) {
                System.out.print(i + ",");
            } else {
                System.out.print(i);
            }
        }
        System.out.println("]");
    }

    private void selectRange(String title) {
        boolean inValidRange = true;
        while (inValidRange) {
            System.out.println(title);
            insertNumbers(sc);
            n1 = getN1();
            n2 = getN2();
            if (n1 < n2) {
                inValidRange = false;
            } else {
                System.out.println("\nInvalid Range. N2 needs to be greater than N1");
            }
        }
    }

    private void adjustToImpair() {
        if (n1 % 2 == 0) {
            n1++;
        }
        if (n2 % 2 == 0) {
            n2--;
        }
    }

    private void adjustToPair() {
        if (n1 % 2 != 0) {
            n1++;
        }
        if (n2 % 2 != 0) {
            n2--;
        }
    }

    public void prime() {
        title = "\nPrime Algorithm (x) to (y)";
        selectPrimeRange(title);
        System.out.print("[");
        if (n1 == 2) {
            System.out.print(n1+",");
            n1++;
        }
        for (int i = n1; i <= n2; i++) {
            if (testPrime(i)){
                if(i==lastPrime()) {
                    System.out.print(i);
                }else{
                    System.out.print(i+",");
                }
            }
        }
        System.out.print("]\n");
    }

    public int lastPrime() {
        int lastPrime = getN2();
        for (int i = n2; i >= n1; i--) {
            if (testPrime(i)) {
                lastPrime = i;
                break;
            }
        }
        return lastPrime;
    }

    public boolean testPrime(int x) {
        int counter = 0;
        for (int i = (x - 1); i > 1; i--) {
            if (x % i == 0) {
                counter++;
            }
        }
        return counter == 0;
    }

    private void selectPrimeRange(String title) {
        boolean inValidRange = true;
        while (inValidRange) {
            System.out.println(title);
            insertNumbers(sc);
            n1 = getN1();
            n2 = getN2();
            if(n1 > 1) {
                inValidRange = false;
            }else{
                System.out.println("\nInvalid Range. N1 must be greater than 1");
            }
        }
    }

}

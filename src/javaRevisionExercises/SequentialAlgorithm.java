package javaRevisionExercises;

import java.util.Scanner;

public class SequentialAlgorithm extends Operand {
    Scanner sc = new Scanner(System.in);
    private int n1 = 0, n2 = 0;
    private String title;

    public void sequence() {
        title = "\nSequential Algorithm -+(x) < -+(y)";
        if(selectRange(title)){
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
    }

    public void pairs() {
        title = "\nPairs Algorithm -+(x) < -+(y)";
        if(selectRange(title)){
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
    }

    public void impairs() {
        title = "\nImpairs Algorithm -+(x) < -+(y)";
        if(selectRange(title)){
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
    }

    public void prime() {
        title = "\nPrime Numbers Algorithm x(>1) < (y)";
        if(selectPrimeRange(title)){
            System.out.print("[");
            if (n1 == 2 && n2 == 2) {
                System.out.print(n1);
                n1++;
            }else if (n1 == 2 && n2 > 2) {
                System.out.print(n1+",");
                n1++;
            }
            int lastPrime = lastPrime();
            for (int i = n1; i <= n2; i++) {
                if (testPrime(i)){
                    if(i==lastPrime) {
                        System.out.print(i);
                    }else{
                        System.out.print(i+",");
                    }
                }
            }
            System.out.print("]\n");
        }
    }

    private boolean selectRange(String title) {
        boolean inValidRange = true;
        try {
            while (inValidRange) {
                System.out.println(title);
                enterTwoInteger(sc);
                n1 = getN1();
                n2 = getN2();
                if (n1 < n2) {
                    inValidRange = false;
                } else throw new InvalidRangeException("The second number must be greater than the first one.");
            }
        }catch (InvalidRangeException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private boolean selectPrimeRange(String title) {
        boolean inValidRange = true;
        while (inValidRange) {
            try{
                System.out.println(title);
                enterTwoInteger(sc);
                n1 = getN1();
                n2 = getN2();
                if(n1 > 1) {
                    inValidRange = false;
                }else throw  new InvalidRangeException("First number must be greater than one (1)");
            }catch (InvalidRangeException e) {
                System.out.println(e.getMessage());
                return false;
            }
        }
        return true;
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

    public boolean testPrime(int x) {
        int counter = 0;
        for (int i = (x - 1); i > 1; i--) {
            if (x % i == 0) {
                counter++;
            }
        }
        return counter == 0;
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
}

package toRemoveRust;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operand {
    private int n1 = 0;
    private int n2 = 0;
    boolean running;

    public int getN2() {
        return n2;
    }

    public int getN1() {
        return n1;
    }

    public void insertNumbers(Scanner sc) {
        running = true;
        while (running) {
            try {
                System.out.print("Insert an integer: ");
                n1 = sc.nextInt();
                System.out.print("Insert an integer: ");
                n2 = sc.nextInt();

                running = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry. Only integer are accepted.");
                sc.nextLine();
            }
        }
    }

    public int menuOperation(Scanner sc) {
        int option = 0;
        running = true;
        while (running) {

            try {
                System.out.println("Enter operation: ");
                System.out.println("1] Sum");
                System.out.println("2] Subtraction");
                System.out.println("3] Multiplication");
                System.out.println("4] Division");
                System.out.println("0] Exit");
                option = sc.nextInt();

                running = false;
                sc.nextLine();

            } catch (InputMismatchException e) {
                System.out.println("Invalid entry. Only integer are accepted.");
                sc.nextLine();
            }
        }
        return option;
    }
}

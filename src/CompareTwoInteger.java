import java.util.InputMismatchException;
import java.util.Scanner;

public class CompareTwoInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var n1 = 0;

        var n2 = 0;
        boolean exit = false;

        do try {
            System.out.print("Insert first number: ");
            n1 = sc.nextInt();
            System.out.print("Insert second number: ");
            n2 = sc.nextInt();
            verify(n1, n2);
            multiply(n1, n2);

            exit = true;
        } catch (InputMismatchException e) {
            System.out.println("Invalid entry. Only integer are accepted.");
            sc.nextLine();
        } while(!exit);
    }

    private static void verify(int n1, int n2) {
        if (n1 == n2) {
            System.out.println("Both numbers are identical");
        } else if (n1 > n2) {
            System.out.println("First number [" + n1 + "] is greater than the second one [" + n2 + "]");
        } else {
            System.out.println("Second number [" + n2 + "] is greater than the first one [" + n1 + "]");
        }
    }
    private static void multiply(int n1, int n2){
        System.out.printf("%d * %d = %d\n", n1, n2, n1 * n2);
    }
}
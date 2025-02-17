package toRemoveRust;

import java.util.Scanner;

public class ArithmeticOperators extends Operand {
    Scanner sc = new Scanner(System.in);

    public ArithmeticOperators() {
        super();
    }

    public void multiply() {
        insertNumbers(sc);
        System.out.printf("%d x %d = %d\n", getN1(), getN2(), getN1() * getN2());
    }

    public void operate() {
        insertNumbers(sc);
        int operation = 0;
        operation=menuOperation(sc);

        switch (operation) {
            case 1:
                System.out.printf("%d + %d = %d\n", getN1(), getN2(), getN1() + getN2());
                break;
            case 2:
                System.out.printf("%d - %d = %d\n", getN1(), getN2(), getN1() - getN2());
                break;
            case 3:
                System.out.printf("%d x %d = %d\n", getN1(), getN2(), getN1() * getN2());
                break;
            case 4:
                try{
                    System.out.printf("%d / %d = %d\n", getN1(), getN2(), getN1() / getN2());
                    break;
                }catch (ArithmeticException e) {
                    System.out.println("Error."+e.getMessage());
                    sc.nextLine();
                    break;
                }

        }
    }
    public void average(){
        System.out.print("Enter product name: ");
        var productName = sc.nextLine();
        System.out.println("Inform product MINIMUM and MAXIMUM stock quantity: ");
        insertNumbers(sc);
        double averageStock = (double) (getN1()+getN2())/2;
        System.out.printf("\nAverage stock of %s is %.2f units\n",productName.toUpperCase(),averageStock);
        sc.nextLine();
    }
}

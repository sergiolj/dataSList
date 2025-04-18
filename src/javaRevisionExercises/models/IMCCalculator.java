package javaRevisionExercises.models;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IMCCalculator {
    private double imc;
    private String name;
    private double height;

    public void menu(Scanner sc) {
        boolean running = true;
        boolean invalidHeight = true;
        boolean invalidGender = true;

        while (running) {
            System.out.print("Enter your name: ");
            name = sc.nextLine();

            while (invalidHeight) {
                try {
                    System.out.print("Enter your height (m - 1,85): ");
                    height = sc.nextDouble();
                    invalidHeight = false;

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input");
                    sc.nextLine();
                }
            }

            while (invalidGender) {
                System.out.print("Enter your gender (m) Male or (f) Female: ");
                char gender = sc.next().toUpperCase().charAt(0);
                sc.nextLine();

                switch (gender) {
                    case 'M':
                        maleImcCalc();
                        invalidGender = false;
                        break;
                    case 'F':
                        femaleImcCalc();
                        invalidGender = false;
                        break;
                    default:
                        System.out.println("Invalid option. Only 'M' or 'F' are allowed.");
                }
            }
            running = false;
            System.out.println("Exiting IMC Calculator Program...");
        }
    }

    public void maleImcCalc(){
        imc = (72.7* height)-58;
        result(imc);
    }

    public void femaleImcCalc(){
        imc = (62.1 * height)-44.7;
        result(imc);
    }

    public void result(double imc){
        System.out.printf("\nHello %s, according to IMC calculation method, your optimal weight it is %.2f kg\n",name, imc);
    }
}
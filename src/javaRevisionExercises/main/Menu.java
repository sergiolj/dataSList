package javaRevisionExercises.main;

import javaRevisionExercises.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private final Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        boolean running = true;
        int option;

        while (running) {
            try {
                System.out.println("\nSelect an option");
                System.out.println("1] Relational operators (1-2)");
                System.out.println("2] Arithmetic operators (3-5)");
                System.out.println("3] IMC calculator (6)");
                System.out.println("4] Sequential algorithm (7-10)");
                System.out.println("5] Academic Score (11)");
                System.out.println("0] Exit");
                option = sc.nextInt();

                sc.nextLine();

                switch (option) {
                    case 0:
                        running = false;
                        System.out.println("\nExiting Main Program...Goodbye!");
                        break;
                    case 1:
                        relationalMenu();
                        break;
                    case 2:
                        arithmeticMenu();
                        break;
                    case 3:
                        imcCalculator();
                        break;
                    case 4:
                        sequentialAlgorithms();
                        break;
                    case 5:
                        academicScore();
                        break;
                    default:
                        System.out.println("Invalid option. Please enter a valid option (0-5).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error. Only integers are allowed.");
                sc.nextLine();
            }
        }
        sc.close();
    }

    private void relationalMenu() {
        System.out.println("\nStarting Relational Operators...");
        RelationalOperators ro = new RelationalOperators();
        boolean running = true;
        int option;
        while (running) {
            try {
                System.out.println("\nSelect an option");
                System.out.println("[1] Print higher of two numbers");
                System.out.println("[2] Compare two numbers");
                System.out.println("[0] Exit");
                option = sc.nextInt();
                sc.nextLine();

                switch (option) {
                    case 0:
                        running = false;
                        System.out.println("\nExiting Relational Program...");
                        break;
                    case 1:
                        ro.enterTwoInteger(sc);
                        ro.higher();
                        break;
                    case 2:
                        ro.enterTwoInteger(sc);
                        ro.compare();
                        break;

                    default:
                        System.out.println("Invalid option. Please enter a valid option (0-2).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error. Only integers are allowed.");
                sc.nextLine();
            }
        }
    }

    private void arithmeticMenu() {
        System.out.println("\nStarting Arithmetic Operators...");
        ArithmeticOperators ao = new ArithmeticOperators();
        boolean running = true;
        int option;
        while (running) {
            try {
                System.out.println("\nSelect an option");
                System.out.println("[1] Multiply two numbers");
                System.out.println("[2] Operate two numbers");
                System.out.println("[3] Calculate product average stock");
                System.out.println("[0] Exit");
                option = sc.nextInt();
                sc.nextLine();

                switch (option) {
                    case 0:
                        running = false;
                        System.out.println("\nExiting Arithmetic Program...");
                        break;
                    case 1:
                        ao.multiply();
                        break;
                    case 2:
                        ao.operate();
                        break;
                    case 3:
                        ao.average();
                        break;

                    default:
                        System.out.println("Invalid option. Please enter a valid option (0-3).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error. Only integers are allowed.");
                sc.nextLine();
            }
        }
    }

    private void imcCalculator() {
        System.out.println("\nStarting IMC calculator...");
        IMCCalculator imc = new IMCCalculator();
        imc.menu(sc);
    }

    private void sequentialAlgorithms() {
        System.out.println("Starting Sequential Algorithm...");
        SequentialAlgorithm sa = new SequentialAlgorithm();
        boolean running = true;
        int option;
        while (running) {
            try {
                System.out.println("\nSelect an option");
                System.out.println("[1] Sequence -+(x) < -+(y)");
                System.out.println("[2] Pairs -+(x) < -+(y)");
                System.out.println("[3] Impairs -+(x) < -+(y)");
                System.out.println("[4] Prime numbers x(>1) < (y)");
                System.out.println("[0] Exit");
                option = sc.nextInt();
                sc.nextLine();

                switch (option) {
                    case 0:
                        running = false;
                        System.out.println("\nExiting Sequential Algorithms Program...");
                        break;
                    case 1:
                        sa.sequence();
                        break;
                    case 2:
                        sa.pairs();
                        break;
                    case 3:
                        sa.impairs();
                        break;
                    case 4:
                        sa.prime();
                        break;

                    default:
                        System.out.println("Invalid option. Please enter a valid option (0-4).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error. Only integers are allowed.");
                sc.nextLine();
            }
        }
    }

    private void academicScore() {
        System.out.println("Starting Academic Score...");
        AcademicScore as = new AcademicScore();
        as.menu(sc);
    }
}

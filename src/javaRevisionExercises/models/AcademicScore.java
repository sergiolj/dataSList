package javaRevisionExercises.models;

import java.util.Scanner;

public class AcademicScore extends Operand{
    private String student;

    public void menu(Scanner sc){
        boolean running = true;
        char option;

        while(running){
            option = '?';
            System.out.print("Enter Student's name: ");
            student = sc.nextLine();

            System.out.println("Enter the student's three assessment scores. The average will be calculated.");
            enterThreeDouble(sc);
            calculateAverage();

            while(option != 'Y' && option != 'N'){
            System.out.println("Do you wish to continue? (Y/N)");
            option = sc.next().toUpperCase().charAt(0); //To avoid StringOutOfBoundsException Needs to use .next() not nextLine()
            sc.nextLine();

                if(option == 'Y'){
                    running = true;
                }else if(option == 'N'){
                    running = false;
                }else{
                    System.out.println("Invalid option. Try again.");
                }
            }
        }
        System.out.println("\nExiting Academic Score Program...");
    }

    private void calculateAverage() {
        double average = 0;
        average = (getD1()+getD2()+getD3())/3;
        System.out.printf("The %s average score is %.2f\n",student, average);
    }

}

package avaliacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private final Scanner sc = new Scanner(System.in);
    MyList list = new MyList();

    public void mainMenu() {
        boolean running = true;
        int option;

        while (running) {
            try {
                System.out.println("\nSelect an option");
                System.out.println("1] Informe 10 números inteiros");
                System.out.println("2] Apagar último");
                System.out.println("3] Imprimir lista");
                System.out.println("0] Sair");
                option = sc.nextInt();

                sc.nextLine();

                switch (option) {
                    case 0:
                        running = false;
                        System.out.println("\nExiting Main Program...Goodbye!");
                        break;
                    case 1:
                        insertNumber();
                        break;
                    case 2:
                        removeLast();
                        break;
                    case 3:
                        printList();
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor escolha uma opção válida! (0-3).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro! Apenas inteiros são permitidos.");
                sc.nextLine();
            }
        }
        sc.close();
    }

    private void printList() {
        System.out.println(list.toString());
    }

    private void insertNumber() {
        int counter = 0;

        try{
            while(counter < 10){
                System.out.print("Insira um número inteiro positivo: ");
                int n = sc.nextInt();
                if(list.verify(n)){
                    list.add(n);
                    counter++;
                }else {
                    System.out.println("Números ímpares serão descartados");
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Erro! Apenas inteiros são permitidos.");
        }
        System.out.println(list.toString());
    }

    private void removeLast() {
        list.remove();
        printList();
    }

}

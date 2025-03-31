package list3.menu;

import list3.collections.MyLinkedList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuSevenElements {
    private Scanner sc = new Scanner(System.in);
    private boolean running = true;
    private final MyLinkedList<Integer> list = new MyLinkedList<>();

    public void mainMenu() {
        int choice = 0;
        while (running) {
            try {
                options();
                choice = sc.nextInt();
                sc.nextLine();
                functionSwitch(choice);
            } catch (InputMismatchException e) {
                System.out.println("\nOpção inválida! Digite um número inteiro entre 0-3");
                sc.nextLine();
            }
        }
        System.out.println("\nEncerrando aplicação...");
        sc.close();
    }

    public void options() {
        System.out.println("\nLISTA DE 7 INTEIROS");
        System.out.println("0] Sair");
        System.out.println("1] Inserir no início");
        System.out.println("2] Inserir no final");
        System.out.println("3] Apagar lista");

        System.out.println("\nDigite uma opção [0-3]: ");
    }

    public void functionSwitch(int choice) {
        switch (choice) {
            case 0:
                running = false;
                break;
            case 1:
                inserirInicio();
                break;
            case 2:
                inserirFinal();
                break;
            case 3:
                apagar();
                break;
            default:
                System.out.println("\nOpção Inválida.");
        }
    }

    private void inserirInicio() {
        while(list.getSize() < 7){
            System.out.println("\nResta(m) " + (7 - list.getSize()) + " espaços na lista");
            System.out.print("Digite um inteiro: ");
            int n = sc.nextInt();
            list.addAtBeginning(n);
        }
        System.out.println(list);
        System.out.println("Lista está completa!");
    }

    private void inserirFinal() {
        while(list.getSize() < 7){
            System.out.println("\nResta(m) " + (7 - list.getSize()) + " espaços na lista");
            System.out.print("Digite um inteiro: ");
            int n = sc.nextInt();
            list.add(n);
        }
        System.out.println(list);
        System.out.println("Lista está completa!");
    }

    private void apagar() {
        list.eraseAll();
    }
}

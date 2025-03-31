package list3.menu;

import list3.collections.MyLinkedList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuNumInteger {
    private final MyLinkedList<Integer> list = new MyLinkedList<>();
    private final Scanner sc = new Scanner(System.in);
    private boolean running = true;

    public void mainMenu() {
        int choice = 0;

        while (running) {
            try {
                options();
                choice = sc.nextInt();
                sc.nextLine();
                functionSwitch(choice);
            } catch (InputMismatchException e) {
                System.out.println("\nOpção inválida! Digite um número inteiro entre 0-2");
                sc.nextLine();
            }
        }
        System.out.println("\nEncerrando aplicação...");
        sc.close();
    }

    public void options() {
        System.out.println("\nCADASTRO DE INTEIROS");
        System.out.println("0] Sair");
        System.out.println("1] Informe 15 números inteiros");
        System.out.println("2] Retornar posição número n");
        System.out.print("\nDigite uma opção [0-2]: ");
    }

    public void functionSwitch(int choice) {
        switch (choice) {
            case 0:
                running = false;
                break;
            case 1:
                insertNumber();
                break;
            case 2:
                searchN();
                break;
            default:
                System.out.println("Opção inválida. Por favor escolha uma opção válida! (0-2).");
        }
    }

    private void insertNumber() {
        int counter = 0;
        while (counter < 15) {
            try {
                System.out.print("Insira um número inteiro: ");
                int n = sc.nextInt();
                list.add(n);
                counter++;
            } catch (InputMismatchException e) {
                System.out.println("Erro! Apenas inteiros são permitidos.");
                sc.nextLine();
            }
        }
        System.out.println(list);
    }

    private void searchN() {
        if (list.isEmpty()) {
            System.out.println("Lista vazia!");
        }else{
            System.out.print("\nQual o número que deseja buscar? ");
            int n = sc.nextInt();
            sc.nextLine();
            int index = list.firstElementIndexOf(n);
            String response = index == -1? "Elemento não encontrado" : "Elemento encontrado no índice " + index;
            System.out.println(response);
        }

    }
}

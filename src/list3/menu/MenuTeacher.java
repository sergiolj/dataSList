package list3.menu;

import list3.collections.MyLinkedList;
import list3.model.Teacher;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuTeacher {
    private final MyLinkedList<Teacher> list = new MyLinkedList<>();
    private Scanner sc = new Scanner(System.in);
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
                    System.out.println("\nOpção inválida! Digite um número inteiro entre 0-5");
                    sc.nextLine();
                }
            }
        System.out.println("\nEncerrando aplicação...");
            sc.close();
    }

    private void options(){
        System.out.println("\nCADASTRAMENTO DE PROFESSORES:");
        System.out.println("0] Finalizar Programa");
        System.out.println("1] Adicionar professor");
        System.out.println("2] Remover último professor adicionado");
        System.out.println("3] Verificar, lista está vazia?");
        System.out.println("4] Apagar lista");
        System.out.println("5] Listar professores cadastrados");

        System.out.print("\nDigite uma opção [0-5]: ");
    }

    private void functionSwitch(int choice){
            switch (choice) {
                case 0:
                    running = false;
                    break;
                case 1:
                    add();
                    break;
                case 2:
                    remove();
                    break;
                case 3:
                    verify();
                    break;
                case 4:
                    erase();
                    break;
                case 5:
                    list();
                    break;
                default:
                    System.out.println("\nOpção Inválida.");
            }
        }

    private void add() {
        System.out.print("\nDigite o nome do professor: ");
        String name = sc.nextLine();
        String response = list.add(new Teacher(name)) ? "\nProfessor adicionado com sucesso" : "\nErro ao adicionar professor";
        System.out.println(response);
    }

    private void remove() {
        String response = list.removeLast() ? "\nProfessor removido com sucesso!" :  "\nImpossível remover. A lista está vazia.";
        System.out.println(response);
    }

    private void verify() {
        String response = list.isEmpty() ? "\nA lista está vazia" : "\nA lista contém elementos";
        System.out.println(response);
    }

    private void erase() {
        String response = list.eraseAll() ? "\nLista apagada com sucesso!" :  "\nImpossível apagar. A lista está vazia.";
        System.out.println(response);
    }

    private void list() {
        String response = list.isEmpty() ? "\nA lista está vazia." : "\n" + list;
        System.out.println(response);
    }
}

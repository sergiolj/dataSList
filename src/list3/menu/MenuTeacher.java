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
                    System.out.println("\nOpção inválida! Digite um número inteiro entre 0-6");
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
        System.out.println("6] Pesquisar professor");

        System.out.print("\nDigite uma opção [0-6]: ");
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
                case 6:
                    search();
                    break;
                default:
                    System.out.println("\nOpção Inválida.");
            }
        }

    private void add() {
        System.out.print("\nDigite o nome do professor: ");
        String name = sc.nextLine();
        String response = list.add(new Teacher(name)) ? "\nProfessor(a) adicionado com sucesso" : "\nErro ao adicionar professor(a)";
        System.out.println(response);
    }

    private void remove() {
        String response = list.removeLast() ? "\nProfessor(a) removido com sucesso!" :  "\nImpossível remover. A lista está vazia.";
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
    private void search() {
        System.out.print("\nDigite o nome do professor(a): ");
        String name = sc.nextLine();
        int index = list.search(new Teacher (name));
        String response = index == -1 ? "\nPesquisa não retornou resultados." : "\nProfessor(a) " + name + " encontrado no índice ["+index+"]" ;
        System.out.println(response);
    }
}

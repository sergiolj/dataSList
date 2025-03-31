package list3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private MyLinkedList<Teacher> list = new MyLinkedList<>();
    Scanner sc = new Scanner(System.in);
    boolean running = true;

    public void MainMenu() {
            int choice = 0;

            while (running) {
                try {
                    optionMenu();
                    choice = sc.nextInt();
                    sc.nextLine();
                    functions(choice);
                } catch (InputMismatchException e) {
                    System.out.println("Opção inválida! Digite um número inteiros entre 0-5");
                    sc.nextLine();
                }
            }
        System.out.println("Encerrando aplicação...");
    }

    private void optionMenu(){
        System.out.println("\nCADASTRAMENTO DE PROFESSORES:");
        System.out.println("0] Finalizar Programa");
        System.out.println("1] Adicionar professor");
        System.out.println("2] Remover último professor adicionado");
        System.out.println("3] Verificar, lista está vazia?");
        System.out.println("4] Apagar lista");
        System.out.println("5] Listar professores cadastrados");

        System.out.print("Digite uma opção [0-5]: ");
    }

    private void functions(int choice){
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
        list.add(new Teacher(name));
    }

    private void remove() {
        String response = list.removeLast() ? "Professor removido com sucesso!" :  "Impossível remover. A lista está vazia.";
        System.out.println(response);
    }

    private void verify() {
        String response = list.isEmpty() ? "A lista está vazia" : "A lista contém elementos";
        System.out.println(response);
    }

    private void erase() {
        String response = list.eraseAll() ? "Lista apagada com sucesso!" :  "Impossível apagar. A lista está vazia.";
        System.out.println(response);
    }

    private void list() {
        System.out.println(list);
    }
}

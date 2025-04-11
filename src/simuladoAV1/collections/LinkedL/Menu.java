package simuladoAV1.collections.LinkedL;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu  implements InterfaceMenu {
   private boolean running = true;
   private final Scanner sc = new Scanner(System.in);
   LinkedList<Student> list = new LinkedList<>();

    @Override
    public void mainMenu() {
        int choice = 0;
        while (running) {
            try {
                options();
                choice = sc.nextInt();
                functionSwitch(choice);
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida! Apenas inteiros são permitidos!");
                sc.nextLine();
            }
        }
        sc.close();
    }

    @Override
    public void options() {
        System.out.println("Options:");
        System.out.println("1. Inserir");
        System.out.println("2. Remover");
        System.out.println("3. Listar");
        System.out.println("0. Sair");
        System.out.println("Escolha uma das opções [0-3]");
    }

    @Override
    public void functionSwitch(int choice) {
        sc.nextLine();
        switch (choice) {
            case 1:
                inserir();
                break;
            case 2:
                remover();
                break;
            case 3:
                listar();
                break;
            case 0:
                running = false;
                break;
            default:
                System.out.println("Opção inválida! Digite um inteiro entre 0 e 3");
                break;
        }
    }

    private void inserir() {
        System.out.println("Digite o nome: ");
        String name = sc.nextLine();
        list.add(new Student(name));
        System.out.println("Estudante "+ name + " adicionado com sucesso!");
    }

    private void remover() {
        list.remove();
    }

    private void listar() {
        System.out.println(list);
    }

}

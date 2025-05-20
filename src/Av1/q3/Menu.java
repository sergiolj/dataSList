package Av1.q3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    MyListaEncadeada<Show> list = new MyListaEncadeada<>();
    Scanner sc = new Scanner(System.in);
    boolean running = true;


    public void mainMenu(){

        int choice = 0;

        while(running){
            try{
                options();
                choice = sc.nextInt();
                functionsSwitch(choice);

            }catch(InputMismatchException e){
                System.out.println("Opção inválida. Apenas inteiros [0-2]");
                sc.nextLine();
            }
        }
    }

    public void options(){
        System.out.println("\nOptions:");
        System.out.println("0] Sair");
        System.out.println("1] Adicionar Show");
        System.out.println("2] Listar Shows");
        System.out.println("Digite uma opção de [0-2]");

    }

    public void functionsSwitch(int choice) {
        sc.nextLine();
        switch (choice) {
            case 0:
                running = false;
                break;
            case 1:
                adicionar();
                break;
            case 2:
                listar();
                break;
            default:
                System.out.println("Opção inválida. Escolha uma opção válida [0-2].");
                break;
        }
    }

    private void adicionar() {
        System.out.print("Digite o nome do Show: ");
        String nome;
        nome = sc.nextLine();
        list.adicionar(new Show(nome));
        System.out.println("Show de " + nome + " adicionado com sucesso!");
    }

    private void listar() {
        System.out.println(list);

    }
}

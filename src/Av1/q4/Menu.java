package Av1.q4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    MyListaDuplaEncadeada<Passageiros> list = new MyListaDuplaEncadeada<>();
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
                System.out.println("Opção inválida. Apenas inteiros [0-5]");
                sc.nextLine();
            }
        }
    }

    public void options(){
        System.out.println("\nOptions:");
        System.out.println("0] Sair");
        System.out.println("1] Adicionar no começo");
        System.out.println("2] Remover do fim");
        System.out.println("3] Listar");
        System.out.println("Digite uma opção de [0-3]");

    }

    public void functionsSwitch(int choice) {
        sc.nextLine();
        switch (choice) {
            case 0:
                running = false;
                break;
            case 1:
                adicionarInicio();
                break;
            case 2:
                removerFim();
                break;
            case 3:
                listar();
                break;
            default:
                System.out.println("Opção inválida. Escolha uma opção válida [0-3].");
                break;
        }
    }

    private void adicionarInicio() {
        System.out.print("Digite o nome do passageiro: ");
        String nome;
        nome = sc.nextLine();
        list.adicionarInicio(new Passageiros(nome));
        System.out.println("Passageiro(a) " + nome + " adicionado(a) com sucesso!");
    }

    private void removerFim() {
        list.removerFim();
        listar();
    }
    private void listar() {
        System.out.println(list);
    }
}

package list5.q1;

import list5.stack.Stack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Stack<String> pilha = new Stack<>();
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
                System.out.println("Opção inválida. Apenas inteiros [0-3]");
                sc.nextLine();
            }
        }
    }

    public void options(){
        System.out.println("\nOptions:");
        System.out.println("0] Sair");
        System.out.println("1] Inserir na Pilha");
        System.out.println("2] Consultar na Pilha");
        System.out.println("3] Remover da Pilha");
        System.out.println("4] Esvaziar Pilha");
        System.out.println("5] Listar Pilha");
        System.out.println("Digite uma opção de [0-5]");

    }

    public void functionsSwitch(int choice) {
        sc.nextLine();
        switch (choice) {
            case 0:
                running = false;
                break;
            case 1:
                inserir();
                break;
            case 2:
                consultar();
                break;
            case 3:
                remover();
                break;
            case 4:
                esvaziar();
                break;
            case 5:
                listar();
                break;
            default:
                System.out.println("Opção inválida. Escolha uma opção válida [0-5].");
                break;
        }
    }

    private void listar() {
        System.out.println(pilha);
    }

    private void esvaziar() {
        pilha.clear();
    }

    private void consultar() {
        System.out.print("Digite o nome de um livro para consultar na pilha: ");
        String bookTittle = sc.nextLine();
        if (pilha.getObject(bookTittle) != null) {
            System.out.println("Número " + bookTittle + " está na pilha.");
        }else {
            System.out.println("Livro não encontrado na pilha.");
        }
    }

    private void inserir() {
        System.out.print("Digite o nome de um livro para inserir na pilha: ");
        String bookTittle = sc.nextLine();
        pilha.push(bookTittle);
        System.out.println("Livro " + bookTittle + " inserido na pilha.");
    }

    private void remover() {
        pilha.pop();
    }
}

package list4.q4;

import list4.MyListaDuplaEncadeada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    MyListaDuplaEncadeada<Integer> list = new MyListaDuplaEncadeada<>();
    Scanner sc = new Scanner(System.in);
    int countDown = 15;
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
        System.out.println("1] Inserir no inicio");
        System.out.println("2] Inserir no fim");
        System.out.println("3] Remover no inicio");
        System.out.println("4] Remover no fim");
        System.out.println("5] Listar");
        System.out.println("Digite uma opção de [0-5]");

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
                adicionarFim();
                break;
            case 3:
                removerInicio();
                break;
            case 4:
                removerFim();
                break;
            case 5:
                listar();
                break;
            default:
                System.out.println("Opção inválida. Escolha uma opção válida [0-5].");
                break;
        }
    }

    private void removerFim() {
        list.removerFim();
        countDown++;

    }

    private void removerInicio() {
        list.removerInicio();
        countDown++;
    }

    private void adicionarInicio() {
        int userEntry = 0;
        if(countDown==0){
            System.out.println("Lista está cheia. Para adicionar remova elementos antes de tentar novamente.");
        }
        while (countDown!=0){
            try{
                System.out.println("Faltam " + countDown + " números para inserir.");
                System.out.print("Digite um número inteiro ímpar: ");
                userEntry =  sc.nextInt();
                if(userEntry%2!=0){
                    list.adicionarInicio(userEntry);
                    System.out.println("Número " + userEntry + " adicionado(a) com sucesso!");
                    countDown--;
                }else{
                    System.out.println("Somente números inteiros são permitidos. Tente novamente.");
                }
            }catch (InputMismatchException e){
                System.out.println("Opção inválida. Digite um número inteiro ímpar.");
                sc.nextLine();
            }
        }
    }

    private void adicionarFim() {
        int userEntry = 0;
        if(countDown==0){
            System.out.println("Lista está cheia. Para adicionar remova elementos antes de tentar novamente.");
        }
        while (countDown!=0){
            try{
                System.out.println("Faltam " + countDown + " números para inserir.");
                System.out.print("Digite um número inteiro ímpar: ");
                userEntry =  sc.nextInt();
                if(userEntry%2!=0){
                    list.adicionarFim(userEntry);
                    System.out.println("Número " + userEntry + " adicionado(a) com sucesso!");
                    countDown--;
                }else{
                    System.out.println("Somente números inteiros são permitidos. Tente novamente.");
                }
            }catch (InputMismatchException e){
                System.out.println("Opção inválida. Digite um número inteiro.");
                sc.nextLine();
            }
        }
    }

    private void listar() {
        System.out.println(list);

    }
}

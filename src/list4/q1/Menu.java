package list4.q1;

import list4.MyListaDuplaEncadeada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    MyListaDuplaEncadeada<Integer> list = new MyListaDuplaEncadeada<>();
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
        System.out.println("1] Adicionar à direita");
        System.out.println("2] Adicionar à esquerda");
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
                adicionarFim();
                break;
            case 2:
                adicionarInicio();
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
        boolean inValidEntry = true;
        int userEntry = 0;
        while (inValidEntry){
            try{
                System.out.print("Digite um número inteiro ");
                userEntry =  sc.nextInt();
                list.adicionarInicio(userEntry);
                System.out.println("Número " + userEntry + " adicionado(a) com sucesso!");
                inValidEntry = false;
            }catch (InputMismatchException e){
                System.out.println("Opção inválida. Digite um número inteiro.");
                sc.nextLine();
            }
        }
    }

    private void adicionarFim() {
        boolean inValidEntry = true;
        int userEntry = 0;
        while (inValidEntry){
            try{
                System.out.print("Digite um número inteiro ");
                userEntry =  sc.nextInt();
                list.adicionarFim(userEntry);
                System.out.println("Número " + userEntry + " adicionado(a) com sucesso!");
                inValidEntry = false;
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

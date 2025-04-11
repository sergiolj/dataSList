package simuladoAV1.q2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    MyListaEncadeada<Viagem> list = new MyListaEncadeada<>();
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
        System.out.println("1] Adicionar Viagem");
        System.out.println("2] Remover última Viagem");
        System.out.println("3] Listar Viagens");
        System.out.println("Digite uma opção de [0-3]");

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
                remover();
                break;
            case 3:
                listar();
                break;
            default:
                System.out.println("Opção inválida. Escolha uma opção válida [0-3].");
                break;
        }
    }

    private void adicionar() {
        System.out.print("Digite o local de destino: ");
        String destino;
        destino = sc.nextLine();
        list.adicionar(new Viagem(destino));
        System.out.println("Viagem para " + destino + " adicionada com sucesso!");
    }

    private void remover() {
        list.remover();
    }

    private void listar() {
        System.out.println(list);

    }
}

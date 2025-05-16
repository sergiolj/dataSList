package list6.q3;

import list6.models.Client;
import list6.models.Contact;

import java.util.ArrayDeque;
import java.util.InputMismatchException;
import java.util.Queue;
import java.util.Scanner;

public class Menu {
    Queue<Client> fila = new ArrayDeque<>();
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
                System.out.println("Opção inválida. Apenas inteiros [0-4]");
                sc.nextLine();
            }
        }
    }

    public void options(){
        System.out.println("\nOptions:");
        System.out.println("0] Sair");
        System.out.println("1] Inserir Cliente");
        System.out.println("2] Remover Cliente");
        System.out.println("3] Listar todos os Clientes");
        System.out.println("4] Consultar tamanho da fila");
        System.out.println("Digite uma opção de [0-4]");

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
                remover();
                break;
            case 3:
                listar();
                break;
            case 4:
                consultarTamanho();
                break;
            default:
                System.out.println("Opção inválida. Escolha uma opção válida [0-4].");
                break;
        }
    }

    private void consultarTamanho() {
        if(!fila.isEmpty()){
            System.out.println("Restam " + fila.size() + " cliente(s) na fila.");
        }else {
            System.out.println("Todos os clientes foram atendidos, a fila está vazia.");
        }
    }

    private void listar() {
        if(fila.isEmpty()){
            System.out.println("A fila está vazia.");
        }
        System.out.println(fila);
    }

    private void inserir() {
        System.out.print("Digite o nome do cliente para inserir na fila: ");
        String name = sc.nextLine();
        System.out.print("Digite a idade do cliente: ");
        int age = sc.nextInt();
        sc.nextLine();

        fila.add(new Client(name, age));
        System.out.println("Cliente " + name + " inserido na fila.");
    }

    private void remover() {
        if (!fila.isEmpty()) {
                System.out.println("Atendendo cliente " + fila.peek());
            try {
                Thread.sleep(2000);
                fila.remove();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else{
            System.out.println("Fila está vazia.");
        }
    }
}

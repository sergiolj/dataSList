package list6.q2;

import list6.models.Contact;

import java.util.ArrayDeque;
import java.util.InputMismatchException;
import java.util.Queue;
import java.util.Scanner;

public class Menu {
    Queue<Contact> fila = new ArrayDeque<>();
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
        System.out.println("1] Inserir Contato");
        System.out.println("2] Próximo Contato");
        System.out.println("3] Listar todos os Contatos");
        System.out.println("Digite uma opção de [0-3]");

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
            default:
                System.out.println("Opção inválida. Escolha uma opção válida [0-3].");
                break;
        }
    }

    private void listar() {
        if(fila.isEmpty()){
            System.out.println("A fila está vazia.");
        }
        System.out.println(fila);
    }

    private void inserir() {
        System.out.print("Digite o nome do contato para inserir na fila: ");
        String name = sc.nextLine();
        System.out.print("Digite o número do telefone do contato: ");
        String phoneNumber = sc.nextLine();

        fila.add(new Contact(name, phoneNumber));
        System.out.println("Contato " + name + " inserida na fila.");
    }

    private void remover() {
        if (!fila.isEmpty()) {
            System.out.println("Contactar " + fila.peek());
            System.out.println("Deseja remover um contato? (S/N)");
            if (sc.nextLine().equalsIgnoreCase("s")) {
                fila.remove();
            }else{
                Contact moveContato = fila.peek();
                fila.remove();
                fila.add(moveContato);
                System.out.println("Contato enviado para o final da fila para nova tentativa");
            }
        }else{
            System.out.println("Fila está vazia.");
        }

    }
}

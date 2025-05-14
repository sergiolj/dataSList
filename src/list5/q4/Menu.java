package list5.q4;

import list5.stack.Stack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    boolean running = true;
    Stack<String> pilha;

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
        System.out.println("1] Inicializar a pilha");
        System.out.println("2] Adicione um endereço url na pilha");
        System.out.println("3] Remova último endereço adicionado na pilha");
        System.out.println("Digite uma opção de [0-3]");

    }

    public void functionsSwitch(int choice) {
        sc.nextLine();
        switch (choice) {
            case 0:
                running = false;
                break;
            case 1:
                inicializarPilha();
                break;
            case 2:
                inserir();
                break;
            case 3:
                remover();
                break;
            default:
                System.out.println("Opção inválida. Escolha uma opção válida [0-3].");
                break;
        }
    }

    private void remover() {
        if(verificaPilha()){
            if(!pilha.isEmpty()){
                System.out.println("Tarefa removida da pilha: " + pilha.peek());
                pilha.pop();
            }
        }else{
            System.out.println("Pilha não foi inicializada");
        }
    }
    private boolean verificaPilha(){
        return pilha != null;
    }

    private void inicializarPilha() {
        if(this.pilha == null){
            this.pilha = new Stack<>();
            System.out.println("Pilha inicializada com sucesso.");
        }else{
            System.out.println("Pilha já foi inicializada.");
        }
    }

    private void addUrl(){
        System.out.print("Insira a url a ser armazenada na pilha: ");
        String url = sc.nextLine();
        pilha.push(url);
        System.out.println("Endereço da página web " + url + " inserida na pilha.");
    }

    private void inserir() {
        if(verificaPilha()){
            addUrl();
        }else{
            System.out.println("Pilha ainda não foi inicializada, deseja inicializar? [S/N]");
            if(sc.next().equalsIgnoreCase("s")) {
                sc.nextLine();
                inicializarPilha();
                addUrl();
            }else{
                System.out.println("Impossível adicionar endereço, pilha não foi inicializada.");
            }
        }
    }

}

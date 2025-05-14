package list5.q3;

import list5.stack.Stack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Stack<String> pilha = new Stack<>();
    Scanner sc = new Scanner(System.in);
    boolean running = true;


    public void mainMenu(){
        criarTarefas();

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
        System.out.println("1] Inserir uma tarefa na pilha");
        System.out.println("2] Obter a próxima tarefa da pilha");
        System.out.println("Digite uma opção de [0-2]");

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
            default:
                System.out.println("Opção inválida. Escolha uma opção válida [0-2].");
                break;
        }
    }

    private void criarTarefas() {
        pilha.push("Colocar a roupa para lavar");
        pilha.push("Comprar fazer lista de compras");
        pilha.push("Tirar o lixo");
        pilha.push("Regar as plantas");
        pilha.push("Passear com o cachorro");
    }


    private void inserir() {
        System.out.print("Descreva a tarefa para inserir na pilha: ");
        String tarefa = sc.nextLine();
        pilha.push(tarefa);
        System.out.println("Tarefa " + tarefa + " inserida na pilha.");
    }

    private void consultar() {
        if(!pilha.isEmpty()){
            System.out.println("Próxima tarefa: " + pilha.peek());
            System.out.println("Esta tarefa foi concluída? [S/N]");
            if(sc.next().equalsIgnoreCase("s")) {
                pilha.pop();
                System.out.println("Tarefa retirada da pilha.");
            }else{
                System.out.println("Tarefa foi mantida na pilha.");
            }
        }
    }
}

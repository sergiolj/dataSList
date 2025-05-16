package list6.q1;

import list6.models.Music;

import java.util.ArrayDeque;
import java.util.InputMismatchException;
import java.util.Queue;
import java.util.Scanner;

public class Menu {
    Queue<Music> fila = new ArrayDeque<>();
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
        System.out.println("1] Inserir Música");
        System.out.println("2] Consultar Música");
        System.out.println("3] Remover Música");
        System.out.println("4] Listar playlist");
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
                consultar();
                break;
            case 3:
                remover();
                break;
                case 4:
                    listar();
                    break;
            default:
                System.out.println("Opção inválida. Escolha uma opção válida [0-4].");
                break;
        }
    }

    private void listar() {
        if(fila.isEmpty()){
            System.out.println("A fila está vazia.");
        }
        System.out.println(fila);
    }

    private void consultar() {
        System.out.print("Digite o nome da música para consultar na fila: ");
        String element = sc.nextLine();

        boolean encontrado = fila.stream().anyMatch(m -> m.getTitle().equalsIgnoreCase(element));
        if (encontrado) {
            System.out.println("Música " + element + " está na fila.");
        }else {
            System.out.println("Música não encontrada na fila.");
        }
    }

    private void inserir() {
        System.out.print("Digite o nome da música para inserir na fila: ");
        String musicTitle = sc.nextLine();
        fila.add(new Music(musicTitle));
        System.out.println("Música " + musicTitle + " inserida na fila.");
    }

    private void remover() {
        if (!fila.isEmpty()) {
            System.out.println("Música " + fila.peek() + " removida da fila.");
            fila.remove();
        }else{
            System.out.println("Fila está vazia.");
        }

    }
}

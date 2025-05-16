package list6.q5;

import list6.models.Patient;

import java.util.ArrayDeque;
import java.util.InputMismatchException;
import java.util.Queue;
import java.util.Scanner;

public class Menu {
    Queue<Patient> fila = new ArrayDeque<>();
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
        System.out.println("1] Inserir Paciente");
        System.out.println("2] Atender Paciente");
        System.out.println("3] Listar todos os Pacientes em espera");
        System.out.println("4] Consulta próximo Paciente");
        System.out.println("5] Consultar tamanho da fila de pacientes");
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
                atender();
                break;
            case 3:
                listar();
                break;
            case 4:
                consultaProximo();
                break;
            case 5:
                consultarTamanho();
                break;
            default:
                System.out.println("Opção inválida. Escolha uma opção válida [0-5].");
                break;
        }
    }

    private void listar() {
        if(!fila.isEmpty()){
            System.out.println(fila);
        }else{
            msgFilaVazia();
        }
    }

    private void consultarTamanho() {
        if(!fila.isEmpty()){
            System.out.println("Restam " + fila.size() + " paciente(s) na fila.");
        }else {
            msgFilaVazia();
        }
    }

    private void consultaProximo() {
        if (!fila.isEmpty()) {
            System.out.println(fila.peek());
        } else {
            msgFilaVazia();
        }
    }

    private void inserir() {
        System.out.print("Digite o nome do paciente para inserir na fila: ");
        String name = sc.nextLine();

        fila.add(new Patient(name));
        System.out.println("Paciente " + name + " inserido na fila.");
    }

    private void atender() {
        if (!fila.isEmpty()) {
                System.out.println("Atendendo paciente " + fila.peek());
            try {
                Thread.sleep(2000);
                fila.remove();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else{
            msgFilaVazia();
        }
    }

    private void msgFilaVazia(){
        System.out.println("Não há pacientes para serem atendidos. A fila está vazia.");
    }
}

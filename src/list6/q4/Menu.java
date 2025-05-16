package list6.q4;

import list6.models.Client;
import list6.models.Student;

import java.util.*;

public class Menu {
    PriorityQueue<Student> fila = new PriorityQueue<>(
            Comparator.comparing(Student::getAge)
    );
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
        System.out.println("1] Inserir Aluno");
        System.out.println("2] Consultar Aluno");
        System.out.println("3] Listar todos os Alunos");
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
                consultar();
                break;
            case 3:
                listar();
                break;
            default:
                System.out.println("Opção inválida. Escolha uma opção válida [0-3].");
                break;
        }
    }

    private void consultar() {
        System.out.print("Digite o nome do Aluno para consultar na fila: ");
        String element = sc.nextLine();

        boolean encontrado = fila.stream().anyMatch(m -> m.getName().equalsIgnoreCase(element));
        if (encontrado) {
            System.out.println("Aluno " + element + " está na fila.");
        }else {
            System.out.println("Aluno não encontrado na fila.");
        }
    }

    private void msgFilaVazia(){
        System.out.println("Não há alunos cadastrados. A fila está vazia.");
    }

    private void listar() {
        if(!fila.isEmpty()){
            PriorityQueue<Student> copyList = new PriorityQueue<>(fila);
            int n=0;
            while(!copyList.isEmpty()){
                n++;
                System.out.println(n + "-" + copyList.poll());
            }
        }else{
            msgFilaVazia();
        }

    }

    private void inserir() {
        System.out.print("Digite o nome do aluno para inserir na fila: ");
        String name = sc.nextLine();
        System.out.print("Digite a idade do aluno: ");
        int age = sc.nextInt();
        sc.nextLine();

        fila.add(new Student(name, age));
        System.out.println("Aluno " + name + " inserido na fila.");
    }

}

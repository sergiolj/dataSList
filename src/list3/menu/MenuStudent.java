package list3.menu;

import list3.collections.MyLinkedList;
import list3.model.Student;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuStudent {
    private final MyLinkedList<Student> list = new MyLinkedList<>();
    Scanner sc = new Scanner(System.in);
    boolean running = true;
    private final String errorInvalidOption = "\nOpção inválida! Digite um número inteiro entre 0-5.";
    private final String errorEmptyList = "\nA lista está vazia.";
    private final String operationSuccess = "\nOperação realizada com sucesso!";
    private final String operationFail = "\nErro. Operação não realizada!";

    public void mainMenu() {

        int choice = 0;

        while (running) {
            try {
                options();
                choice = sc.nextInt();
                sc.nextLine();
                functionSwitch(choice);
            } catch (InputMismatchException e) {
                System.out.println(errorInvalidOption);
                sc.nextLine();
            }
        }
        System.out.println("\nEncerrando aplicação...");
        sc.close();
    }

    private void options(){
        System.out.println("\nCADASTRAMENTO DE ALUNOS:");
        System.out.println("0] Finalizar Programa");
        System.out.println("1] Adicionar aluno");
        System.out.println("2] Remover último aluno adicionado");
        System.out.println("3] Pesquisar aluno");
        System.out.println("4] Listar aluno");
        System.out.println("5] Ordenar lista de alunos");
        System.out.print("\nDigite uma opção [0-5]: ");
    }

    private void functionSwitch(int choice){
        switch (choice) {
            case 0:
                running = false;
                break;
            case 1:
                add();
                break;
            case 2:
                remove();
                break;
            case 3:
                search();
                break;
            case 4:
                list();
                break;
            case 5:
                orderAZ();
                break;
            default:
                System.out.println(msg(errorInvalidOption));
        }
    }

    private void add() {
        System.out.print("\nDigite o nome do aluno: ");
        String name = sc.nextLine();
        String response = list.add(new Student(name)) ? msg(operationSuccess) : msg(operationFail);
        System.out.println(response);
    }

    private void remove() {
        String response = list.removeLast() ? msg(operationSuccess) : msg(errorEmptyList);
        System.out.println(response);
    }

    private void search() {
        System.out.print("\nDigite o nome do aluno para pesquisar: ");
        String name = sc.nextLine();
        Student student = new Student(name);
        String response = list.isEmpty()? msg(errorEmptyList) :
                          list.containsElement(student) ?
                                  msg(operationSuccess, "Aluno ["+ name + "] localizado.")
                                  : msg( "\nAluno [" + name + "] não localizado.");
        System.out.println(response);
    }

    private void list() {
        String response = list.isEmpty() ? msg(errorEmptyList) : "\n" + list;
        System.out.println(response);
    }

    private void orderAZ() {
        String response = list.bobbleSorted() ?  "\n" + list : msg(errorEmptyList);
        System.out.println(response);
    }

    public String msg(String defaultMsg, String e) {
        return defaultMsg + " " + e;
    }
    public String msg(String defaultMsg) {
        return defaultMsg;
    }
}

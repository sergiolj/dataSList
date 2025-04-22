package list4.q3;

import list4.MyListaDuplaEncadeada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    MyListaDuplaEncadeada<Student> list = new MyListaDuplaEncadeada<>();
    Scanner sc = new Scanner(System.in);
    boolean running = true;


    public void mainMenu() {

        int choice = 0;

        while (running) {
            try {
                options();
                choice = sc.nextInt();
                functionsSwitch(choice);

            } catch (InputMismatchException e) {
                System.out.println("Opção inválida. Apenas inteiros [0-3]");
                sc.nextLine();
            }
        }
    }

    public void options() {
        System.out.println("\nOptions:");
        System.out.println("0] Sair");
        System.out.println("1] Cadastrar grupo alunos [5]");
        System.out.println("2] Adicionar à direita");
        System.out.println("3] Adicionar à esquerda");
        System.out.println("4] Listar");
        System.out.println("Digite uma opção de [0-4]");

    }

    public void functionsSwitch(int choice) {
        sc.nextLine();
        switch (choice) {
            case 0:
                running = false;
                break;
            case 1:
                adicionarN();
                break;
            case 2:
                adicionarFim();
                break;
            case 3:
                adicionarInicio();
                break;
            case 4:
                listar();
                break;
            default:
                System.out.println("Opção inválida. Escolha uma opção válida [0-4].");
                break;
        }
    }

    private void adicionarN() {
        boolean running = true;
        String userName;
        int userAge;
        int num = 0;
        if(list.length()==5){
            System.out.println("Lista já contém 5 elementos.");
        }else{
            while (running) {
                try {
                    System.out.println("A lista contém "+ list.length() + " alunos.");
                    System.out.print("Quantos alunos deseja adicionar (total máx 5)? ");
                    num = sc.nextInt();
                    sc.nextLine();
                    if (list.length() + num <= 5) {
                        while (num > 0) {
                            System.out.print("Informe nome do aluno: ");
                            userName = sc.nextLine();
                            System.out.print("Informe idade do aluno: ");
                            userAge = sc.nextInt();
                            sc.nextLine();
                            list.adicionarInicio(new Student(userName, userAge));
                            num--;
                        }
                        running = false;
                    } else {
                        System.out.println("Número máximo de alunos '5'!");
                    }
                } catch(InputMismatchException e){
                    System.out.println("Opção inválida. Digite um número inteiro.");
                    sc.nextLine();
                }
            }
            System.out.println("Número máximo de alunos atingido [5]");
        }

        }

    private void adicionarInicio() {
        if (list.length() < 7) {
            boolean inValidEntry = true;
            String userName;
            int userAge;
            while (inValidEntry) {
                try {
                    System.out.print("Inform o nome do aluno: ");
                    userName = sc.nextLine();
                    System.out.print("Informe idade do aluno: ");
                    userAge = sc.nextInt();
                    list.adicionarInicio(new Student(userName, userAge));
                    System.out.println("Aluno " + userName + " adicionado(a) com sucesso!");
                    inValidEntry = false;
                } catch (InputMismatchException e) {
                    System.out.println("Opção inválida. Digite um número inteiro.");
                    sc.nextLine();
                }
            }
        }else{
            System.out.println("Número máximo de alunos atingido [7]");
        }
    }

    private void adicionarFim() {
        if (list.length() < 7) {
            boolean inValidEntry = true;
            String userName;
            int userAge;
            while (inValidEntry) {
                try {
                    System.out.print("Inform o nome do aluno: ");
                    userName = sc.nextLine();
                    System.out.print("Informe idade do aluno: ");
                    userAge = sc.nextInt();
                    list.adicionarFim(new Student(userName, userAge));
                    System.out.println("Aluno " + userName + " adicionado(a) com sucesso!");
                    inValidEntry = false;
                } catch (InputMismatchException e) {
                    System.out.println("Opção inválida. Digite um número inteiro.");
                    sc.nextLine();
                }
            }
        }else{
            System.out.println("Número máximo de alunos atingido [7]");
        }
    }

    private void listar() {
        System.out.println(list);

    }
}


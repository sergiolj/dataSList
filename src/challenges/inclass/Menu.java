package challenges.inclass;

import challenges.arvore.BinaryTree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    MyBinaryTree<Integer> arvore = new MyBinaryTree<>();
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
                System.out.println("Opção inválida. Apenas inteiros [0-5]");
                sc.nextLine();
            }
        }
    }

    public void options() {
        System.out.println("\nEstrutura de Árvore Binária");
        System.out.println("Options:");
        System.out.println("0] Sair");
        System.out.println("1] Inserir um número inteiro na árvore");
        System.out.println("2] Listar");
        System.out.println("3] Apagar árvore");
        System.out.println("4] Criar árvore automaticamente");
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
                apagarArvore();
                break;
            case 4:
                inserirArvoreTeste();
                break;
            default:
                System.out.println("Opção inválida. Escolha uma opção válida [0-5].");
                break;
        }
    }

    private void apagarArvore() {
        if(!arvore.isEmpty()){
            arvore.clearAll();
            System.out.println("Árvore binária apagada com sucesso.");
        }else {
            System.out.println("Árvore binária está vazia.");
        }
    }

    private void inserirArvoreTeste() {
        arvore.clearAll();
        arvore.add(50);
        arvore.add(30);
        arvore.add(20);
        arvore.add(40);
        arvore.add(70);
        arvore.add(60);
        arvore.add(80);
        System.out.println("Árvore teste criada com os seguintes nós 50,30,20,40,70,60,80");
    }

    private void consultar() {
        if (!arvore.isEmpty()) {
            try {
                System.out.println("Informe o tipo de ordenação \n" +
                        "[ 1 ] - Pré Ordem (node-esq-dir)\n" +
                        "[ 2 ] - In Ordem (esq-node-dir)\n" +
                        "[ 3 ] - Pós Ordem (esq-dir-node)");
                int option = sc.nextInt();
                sc.nextLine();
                switch (option) {
                    case 1:
                        arvore.preOrder();
                        break;
                    case 2:
                        arvore.inOrder();
                        break;
                    case 3:
                        arvore.postOrder();
                        break;
                    default:
                        System.out.println("Opção inválida. Escolha uma opção válida [1,2 ou 3].");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida.");
            }
        } else {
            System.out.println("A árvore está vazia.");
        }
    }

    private void inserir() {
            try {
                    System.out.println("Informe um número inteiro positivo para inserir na árvore");
                    this.arvore.add(sc.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("Somente números inteiros são permitidos.");
            }
        }

}

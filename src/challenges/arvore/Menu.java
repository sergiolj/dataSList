package challenges.arvore;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    BinaryTree<Integer> arvore = new BinaryTree<>();
    Scanner sc = new Scanner(System.in);
    boolean running = true;
    private static int counter = 0;


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
        System.out.println("1] Inserir a Raiz");
        System.out.println("2] Inserir número inteiro");
        System.out.println("3] Consultar");
        System.out.println("4] Inserir árvore teste");
        System.out.println("5] Apagar arvore");
        System.out.println("Digite uma opção de [0-5]");

    }

    public void functionsSwitch(int choice) {
        sc.nextLine();
        switch (choice) {
            case 0:
                running = false;
                break;
            case 1:
                inserirRaiz();
                break;
            case 2:
                inserir();
                break;
            case 3:
                consultar();
                break;
            case 4:
                inserirArvoreTeste();
                break;
            case 5:
                apagarArvore();
                break;
            default:
                System.out.println("Opção inválida. Escolha uma opção válida [0-5].");
                break;
        }
    }

    private void apagarArvore() {
        if(!arvore.isEmpty()){
            arvore.clearAll();
            counter = 0;
            System.out.println("Árvore binária apagada com sucesso.");
        }else {
            System.out.println("Árvore binária está vazia.");
        }
    }

    private void inserirArvoreTeste() {
        arvore.clearAll();
        counter = 0;
        arvore.add(50);
        arvore.add(32);
        arvore.add(12);
        arvore.add(80);
        arvore.add(100);
        arvore.add(15);
        arvore.add(4);
        arvore.add(44);
        arvore.add(36);
        arvore.add(20);
        counter=10;
        System.out.println("Arvore teste criada com os seguintes nós 50,32,12,80,100,15,4,44,36,20");
    }

    private void inserirRaiz() {
        if (arvore.isEmpty()) {
            int number = 0;
            try {
                System.out.println("Informe um número inteiro para inserir na raiz");
                arvore.add(number = sc.nextInt());
                sc.nextLine();
                System.out.println("Número " + arvore.getRootData() + " inserido com sucesso.");
                counter++;
            } catch (InputMismatchException e) {
                System.out.println("Somente números inteiros são permitidos.");
            }
        } else {
            System.out.println("Árvore já possui elementos e sua raíz é " + arvore.getRootData());
        }
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
        if (!arvore.isEmpty()) {
            int number = 0;
            try {
                if (counter < 10) {
                    System.out.println("Informe um número inteiro positivo para inserir na árvore de raíz " +
                            "(" + arvore.getRootData() + ")");
                    number = sc.nextInt();
                    checkBusinessRules(number);
                }else {
                    System.out.println("Limite de tamanho da árvore alcançado, impossível adicionar elemento.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Somente números inteiros são permitidos.");
            }
        } else {
            System.out.println("Árvore não possui raiz, deseja definir uma raíz (S/N)?");
            if (sc.nextLine().equalsIgnoreCase("s")) {
                inserirRaiz();
            }
        }
    }

    private void checkBusinessRules(Integer number) {
        if (number > 0) {
            if (arvore.add(number)) {
                counter++;
                System.out.println("Número " + number + " inserido com sucesso.");
            } else {
                System.out.println("Valores repetidos não são permitidos.");
            }
        } else {
            System.out.println("Permitidos apenas valores inteiros positivos.");
        }
    }
}

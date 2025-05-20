package list7;

import list7.util.MyBinaryTree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    MyBinaryTree<Integer> tree = new MyBinaryTree<>();
    Scanner sc = new Scanner(System.in);
    boolean running = true;


    public void mainMenu(){
        addDadosArvore();
        System.out.print("\nOs nós da arvore de exemplo foram criados na sequência 5,3,9,7,11,4.\n");
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

    private void addDadosArvore() {
        tree.add(5);
        tree.add(3);
        tree.add(9);
        tree.add(7);
        tree.add(11);
        tree.add(4);
    }

    public void options(){
        System.out.println("\nOptions:");
        System.out.println("0] Sair");
        System.out.println("1] Exibir encaminhamento central (Em Ordem)");
        System.out.println("2] Exibir encaminhamento pré fixado (Pré Ordem)");
        System.out.println("3] Exibir encaminhamento pós fixado (Pós Ordem)");
        System.out.println("4] Exibir apenas nós folhas");
        System.out.println("5] Listar pai e seus filhos");
        System.out.println("Digite uma opção de [0-5]");

    }

    public void functionsSwitch(int choice) {
        sc.nextLine();
        switch (choice) {
            case 0:
                running = false;
                break;
            case 1:
                emOrdem();
                break;
            case 2:
                preOrdem();
                break;
            case 3:
                posOrdem();
                break;
            case 4:
                exibirFolhas();
                break;
            case 5:
                exibirPaiFilhos();
                break;
            default:
                System.out.println("Opção inválida. Escolha uma opção válida [0-5].");
                break;
        }
    }

    private void posOrdem() {
        if(!tree.isEmpty()){
            System.out.println();
            tree.postOrder();
        }else{
            msgFilaVazia();
        }
    }

    private void emOrdem() {
        if(!tree.isEmpty()){
            System.out.println();
            tree.inOrder();
        }else {
            msgFilaVazia();
        }
    }

    private void preOrdem() {
        if (!tree.isEmpty()){
            System.out.println();
            tree.preOrder();
        }else{
            msgFilaVazia();
        }
    }

    private void exibirPaiFilhos() {
        if(!tree.isEmpty()){
            System.out.println("Informe o valor do nó pai a ser pesquisado.");
            int data = sc.nextInt();
            sc.nextLine();
                if(tree.contains(data)) {
                    System.out.println("Exibindo dados em pré-ordem.");
                    tree.fatherAndSons(data);
                }else{
                    System.out.println("Elemento não encontrado na árvore.");
                }
           }else {
            msgFilaVazia();
        }
    }

    private void exibirFolhas() {
        if (!tree.isEmpty()) {
            System.out.println();
            tree.leafsOnly();
        } else {
            msgFilaVazia();
        }
    }

    private void msgFilaVazia(){
        System.out.println("A árvore não contém elementos.");
    }
}

package list7.refatorarMenu.commands;

import list7.refatorarMenu.collections.MyBinaryTree;

import java.util.Scanner;

public class FatherAndSons implements Command {
    private MyBinaryTree<Integer> tree;
    private Scanner sc;

    public FatherAndSons(MyBinaryTree<Integer> tree, Scanner sc) {
        this.tree = tree;
        this.sc = sc;
    }

    @Override
    public boolean execute() {
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
            errorMsg();
        }
        return true;
    }

    @Override
    public String getDescription() {
        return "Listar pai e seus filhos";
    }

    @Override
    public void errorMsg() {
        System.out.println("A árvore não contém elementos.");
    }
}

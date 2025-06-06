package list7.refatorarMenu.commands;

import list7.refatorarMenu.collections.MyBinaryTree;

public class PreOrderTree implements Command {
    private MyBinaryTree<Integer> tree;

    public PreOrderTree(MyBinaryTree<Integer> tree) {
        this.tree = tree;

    }

    @Override
    public boolean execute() {
        if (!tree.isEmpty()){
            System.out.println();
            tree.preOrder();
        }else{
            errorMsg();
        }
        return true;
    }

    @Override
    public String getDescription() {
        return "Exibir encaminhamento pré fixado (Pré Ordem)";
    }

    @Override
    public void errorMsg() {
        System.out.println("A árvore não contém elementos.");
    }
}

package list7.refatorarMenu.commands;

import list7.refatorarMenu.collections.MyBinaryTree;

public class InOrderTree implements Command {
    private final MyBinaryTree<Integer> tree;

    public InOrderTree(MyBinaryTree<Integer> tree) {
        this.tree = tree;
    }

    @Override
    public boolean execute() {
        if(!tree.isEmpty()){
            System.out.println();
            tree.inOrder();
        }else {
            errorMsg();
        }
        return true;
    }

    @Override
    public String getDescription() {
        return "Exibir encaminhamento central (Em Ordem)";
    }

    @Override
    public void errorMsg() {
        System.out.println("A árvore não contém elementos.");
    }

}

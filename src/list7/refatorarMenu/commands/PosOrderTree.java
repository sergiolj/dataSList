package list7.refatorarMenu.commands;

import list7.refatorarMenu.collections.MyBinaryTree;

public class PosOrderTree implements Command {
    private final MyBinaryTree<Integer> tree;

    public PosOrderTree(MyBinaryTree<Integer> tree) {
        this.tree = tree;
    }

    @Override
    public boolean execute() {
        if(!tree.isEmpty()){
            System.out.println();
            tree.postOrder();
        }else{
            errorMsg();
        }
        return true;
    }

    @Override
    public String getDescription() {
        return "Exibir encaminhamento pós fixado (Pós Ordem)";
    }

    @Override
    public void errorMsg() {
        System.out.println("A árvore não contém elementos.");
    }
}

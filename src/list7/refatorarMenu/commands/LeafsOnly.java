package list7.refatorarMenu.commands;

import list7.refatorarMenu.collections.MyBinaryTree;

public class LeafsOnly implements Command {
    private MyBinaryTree<Integer> tree;

    public LeafsOnly(MyBinaryTree<Integer> tree) {
        this.tree = tree;
    }

    @Override
    public boolean execute() {
        if (!tree.isEmpty()) {
            System.out.println();
            tree.leafsOnly();
        } else {
            errorMsg();
        }
        return true;
    }

    @Override
    public String getDescription() {
        return "Exibir apenas nós folhas";
    }

    @Override
    public void errorMsg() {
        System.out.println("A árvore não contém elementos.");
    }
}

package list7.refatorarMenu.commands;

import list7.refatorarMenu.collections.MyBinaryTree;

public class Initialize implements Command{
    private final MyBinaryTree<Integer> tree;

    public Initialize(MyBinaryTree<Integer> tree) {
        this.tree = tree;
        execute();
    }

    @Override
    public boolean execute() {
        tree.add(5);
        tree.add(3);
        tree.add(9);
        tree.add(7);
        tree.add(11);
        tree.add(4);
        return true;
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public void errorMsg() {

    }
}

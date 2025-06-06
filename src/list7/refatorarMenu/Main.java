package list7.refatorarMenu;

import list7.refatorarMenu.collections.MyBinaryTree;
import list7.refatorarMenu.commands.*;
import list7.refatorarMenu.util.ConsoleMenu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyBinaryTree<Integer> tree = new MyBinaryTree<>();

        Command carga = new Initialize(tree);

        ConsoleMenu menu = new ConsoleMenu();

        menu.addOption(new InOrderTree(tree));
        menu.addOption(new PreOrderTree(tree));
        menu.addOption((new PosOrderTree(tree)));
        menu.addOption(new LeafsOnly(tree));
        menu.addOption(new FatherAndSons(tree,sc));
        menu.addOption(new Exit());

        menu.start();
        sc.close();
    }


}

package tree;

public class TreeMainTest {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();

        tree.addRoot(12);
        tree.addLeft(12,10);
        tree.addRight(12,14);

        System.out.println("Imprime árvore binária");
        tree.showPostOrder();
    }
}

package tree.myTree;

public class Main {
    public static void main(String[] args) {
        MyBinaryTree<Integer> tree = new MyBinaryTree<>();
        tree.add(12);
        tree.add(15);
        tree.add(8);
        tree.add(3);
        tree.add(40);
        tree.add(5);
        tree.add(6);

        System.out.println("Preorder traversal : ");
        tree.preOrder();

        System.out.println("Inorder traversal : ");
        tree.inOrder();

        System.out.println("Postorder traversal : ");
        tree.postOrder();

        System.out.println(tree.size());

        System.out.println(tree.minimum());
        System.out.println(tree.maximum());

        tree.remove(12);
        System.out.println();
        System.out.println(tree.size());
        tree.preOrder();
        System.out.println(tree.contains(40));
        System.out.println(tree.contains(6));
        System.out.println(tree.contains(1));

    }
}

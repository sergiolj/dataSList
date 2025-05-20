package tree;

public class TreeMainTest {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        BinaryTree<String> stringTree = new BinaryTree<>();

        stringTree.add("Ana");
        stringTree.add("Maria");
        stringTree.add("Pedro");
        stringTree.add("Xavier");

        stringTree.add("Adão");
        stringTree.preOrder();


//        tree.add(10);
//        tree.add(15);
//        tree.add(5);
//        tree.add(3);
//        tree.add(7);
//        tree.add(20);
//
//        System.out.println("Imprime pré ordem");
//        tree.preOrder();
//
//        System.out.println("Imprime central ordem");
//        tree.centerOrder();
//
//        System.out.println("Imprime pós ordem");
//        tree.postOrder();


//        tree.add(50);
//        tree.add(10);
//        tree.add(13);
//        tree.add(14);
//        tree.add(70);
//        tree.add(13);
//        tree.add(11);
//
//        System.out.println("Imprime pré ordem");
//        tree.preOrder();
//
//        System.out.println("Imprime central ordem");
//        tree.inOrder();
//
//        System.out.println("Imprime pós ordem");
//        tree.postOrder();



    }

}

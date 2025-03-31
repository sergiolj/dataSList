package list3;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        System.out.println(list.getSize());

        list.eraseAll();
        System.out.println(list);
        System.out.println(list.getSize());

        list.add(4);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(list.getSize());

        list.removeLast();
        System.out.println(list);
        System.out.println(list.getSize());
        System.out.println(list.containsElement(2));
        System.out.println(list.containsElement(3));
        System.out.println(list.containsElement(4));

        System.out.println(list.firstElementIndexOf(2));
        System.out.println(list.firstElementIndexOf(5));

        System.out.println(list.isValidRange(5));
        System.out.println(list.isValidRange(1));

        list.remove(0);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.getSize());

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);
        System.out.println(list.getSize());
        list.removeLast();
        list.removeLast();
        list.removeLast();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.removeLast();
    }
}

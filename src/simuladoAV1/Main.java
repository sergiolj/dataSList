package simuladoAV1;

public class Main {
    public static void main(String[] args) {
        var list = new MyListStack<String>();

        list.remove();

        list.add("Banana");
        list.add("Apple");
        list.add("Orange");
        list.add("Pineapple");
        System.out.println(list);
        System.out.println(list.size());
        list.remove();
        System.out.println(list);
        System.out.println(list.size());

        System.out.println(list.contains("Pineapple"));
        System.out.println(list.contains("Orange"));
        System.out.println(list.get(1));
        System.out.println(list.indexOf("Banana"));
        System.out.println(list.indexOf("Strawberry"));
        System.out.println(list.clearAll());
        System.out.println(list);
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");
        list.add("Pineapple");
        System.out.println(list);
        list.remove("Banana");
        System.out.println(list);
        list.remove("Strawberry");
        System.out.println(list);
        list.remove("Pineapple");
        System.out.println(list);
        list.add("Pineapple");
        list.remove("Orange");
        System.out.println(list);
        System.out.println(list.size());
    }
}

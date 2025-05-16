package list6.models;

public class Client {
    private final String name;
    private int age;

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" + name + "|" + age +
                '}';
    }
}

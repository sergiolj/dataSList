package list3.model;

public class Student{
    private final String name;

    public Student(String name) {;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

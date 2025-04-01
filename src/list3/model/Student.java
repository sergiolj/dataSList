package list3.model;

public class Student implements Comparable<Student> {
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

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }
}

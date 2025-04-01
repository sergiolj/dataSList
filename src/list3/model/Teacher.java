package list3.model;

public class Teacher implements Comparable<Teacher> {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Teacher other) {
        return this.name.compareTo(other.name);
    }
}

package list1.tadExerc.models;

public class Student {
    private String name;
    private int semester;


    public Student(String name, int semester) {
        this.semester = semester;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", semester=" + semester +
                '}';
    }
}

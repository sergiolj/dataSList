package list1.tadExerc.models;

public class Student extends NaturalPerson{
    private int semester;

    public Student(String name, String socialSecurityNumber, int semester) {
        super(name, socialSecurityNumber);
        this.semester = semester;
    }

    public Student(NaturalPerson person, int semester) {
        super(person);
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + super.getName() + '\'' +
                ", semester=" + semester +
                '}';
    }
}

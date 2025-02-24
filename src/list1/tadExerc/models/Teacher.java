package list1.tadExerc.models;

public class Teacher extends NaturalPerson{
    private String codClass;

    public Teacher(String name, String socialSecurityNumber, String codClass) {
        super(name, socialSecurityNumber);
        this.codClass = codClass;
    }

    public Teacher(NaturalPerson person, String codClass) {
        super(person);
        this.codClass = codClass;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + super.getName() + '\'' +
                ", codClass='" + codClass + '\'' +
                '}';
    }
}

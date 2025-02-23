package list1.tadExerc.models;

public class Teacher {
    private String name;
    private String codClass;


    public Teacher(String name, String codClass) {
        this.name = name;
        this.codClass = codClass;

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", codClass='" + codClass + '\'' +
                '}';
    }
}

package list1.tadExerc.models;

public class Athlete extends NaturalPerson{
    private int age;

    public Athlete(String name, String socialSecurityNumber, int age) {
        super(name, socialSecurityNumber);
        this.age = age;
    }

    public Athlete(NaturalPerson person, int age) {
        super(person);
        this.age = age;
    }

    public Athlete(String name, int age) {
        super(name);
        this.age = age;
    }
}

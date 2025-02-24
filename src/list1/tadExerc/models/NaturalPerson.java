package list1.tadExerc.models;

public class NaturalPerson {
    private String name;
    private String socialSecurityNumber;

    public NaturalPerson(String name, String socialSecurityNumber) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public NaturalPerson(NaturalPerson person) {
        this.name = person.name;
        this.socialSecurityNumber = person.socialSecurityNumber;
    }

    public NaturalPerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}

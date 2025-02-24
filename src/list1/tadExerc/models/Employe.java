package list1.tadExerc.models;

import java.time.LocalDate;

public class Employe extends NaturalPerson{
    private double salary;
    private String jobTitle;
    private LocalDate admissionDate;

    public Employe(String name, String socialSecurityNumber, double salary, String jobTitle, LocalDate admissionDate) {
        super(name, socialSecurityNumber);
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.admissionDate = admissionDate;
    }
    public Employe(NaturalPerson person, double salary, String jobTitle, LocalDate admissionDate) {
        super(person);
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.admissionDate = admissionDate;
    }
}

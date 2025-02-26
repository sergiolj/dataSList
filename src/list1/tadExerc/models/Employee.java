package list1.tadExerc.models;

import java.time.LocalDate;

public class Employee extends NaturalPerson{
    private double salary;
    private String jobTitle;
    private final LocalDate admissionDate;

    public Employee(String name, String socialSecurityNumber, double salary, String jobTitle, LocalDate admissionDate) {
        super(name, socialSecurityNumber);
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.admissionDate = admissionDate;
    }
    public Employee(NaturalPerson person, double salary, String jobTitle, LocalDate admissionDate) {
        super(person);
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.admissionDate = admissionDate;
    }
}

package list1.tadExerc.models;

import java.time.LocalDate;

public class Patient extends NaturalPerson{
    private LocalDate checkInTime;

    public Patient(NaturalPerson person) {
        super(person);
        this.checkInTime = LocalDate.now();
    }

    public Patient(String name, String socialSecurityNumber) {
        super(name, socialSecurityNumber);
    }

    public LocalDate getCheckInTime() {
        return checkInTime;
    }
}

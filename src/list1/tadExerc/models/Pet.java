package list1.tadExerc.models;

import java.time.LocalDate;

public class Pet {
    private String name;
    private LocalDate birthDate;
    private String tutorPhone;
    private String race;

    public Pet(String name, LocalDate birthDate, String tutorPhone, String race) {
        this.name = name;
        this.birthDate = birthDate;
        this.tutorPhone = tutorPhone;
        this.race = race;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", tutorPhone='" + tutorPhone + '\'' +
                '}';
    }
}

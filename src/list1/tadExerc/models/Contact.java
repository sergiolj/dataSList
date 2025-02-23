package list1.tadExerc.models;

public class Contact {
    private String name;
    private String phone;
    private String email;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

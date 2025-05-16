package list6.models;

public class Contact {
    private final String name;
    private final String phoneNumber;

    public Contact(String name, String phone) {
        this.name = name;
        this.phoneNumber = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "{" + name + ", " + phoneNumber + "}";
    }
}


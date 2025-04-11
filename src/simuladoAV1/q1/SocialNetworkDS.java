package simuladoAV1.q1;

public class SocialNetworkDS<T> implements MyListInterface<User> {
    private String name;
    private User user;

    public SocialNetworkDS(String name) {
        this.name = name;
    }

    @Override
    public boolean add(User object) {
        return false;
    }

    @Override
    public boolean remove(User object) {
        return false;
    }

    @Override
    public boolean update(User object) {
        return false;
    }

    @Override
    public String toString() {
        return "SocialNetworkDS{" +
                "name='" + name + '\'' +
                ", user=" + user +
                '}';
    }
}
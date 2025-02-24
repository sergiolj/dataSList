package list1.tadExerc.models;

public class Client extends NaturalPerson{
    private int discountCategory;
    private ClientType clientType;

    public Client(String name) {
        super(name);
        this.clientType = ClientType.BRONZE;
        this.discountCategory = clientType.getDiscount();
    }

    public Client(NaturalPerson person) {
        super(person);
        this.clientType = ClientType.BRONZE;
        this.discountCategory = clientType.getDiscount();
    }

    public Client(String name, String socialSecurityNumber) {
        super(name, socialSecurityNumber);
        this.clientType = ClientType.BRONZE;
        this.discountCategory = clientType.getDiscount();
    }

    public void setDiscountCategory(ClientType type) {
        this.clientType = type;
        this.discountCategory = type.getDiscount();
    }
}

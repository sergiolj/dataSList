package list1.tadExerc.models;

public enum ClientType {
    BRONZE(5), SILVER(10), GOLD(15);
    private final int discount;

    ClientType(int discount) {
        this.discount = discount;
    }
    public int getDiscount() {
        return discount;
    }
}


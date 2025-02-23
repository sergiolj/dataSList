package list1.tadExerc.models;

public class OrderItem {
    private Client costumerName;
    private String item;
    private int quantity;
    private double price;
    private double total;

    public OrderItem(Client costumerName, String item, int quantity, double price) {
        this.costumerName = costumerName;
        this.item = item;
        this.quantity = quantity;
        this.price = price;
        this.total = price * quantity;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "costumerName=" + costumerName +
                ", item='" + item + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", total=" + total +
                '}';
    }
}

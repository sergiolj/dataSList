package list1.tadExerc.models;

import java.time.LocalDate;

public class Order {
    private NaturalPerson costumerName;
    private LocalDate orderDate;
    private Product item;
    private int quantity;
    private double price;
    private double total;

    public Order(NaturalPerson costumerName, Product item, int quantity) {
        this.costumerName = costumerName;
        this.item = item;
        this.quantity = quantity;
        this.price = item.getPrice();
        this.total = item.getPrice() * quantity;
        this.orderDate = LocalDate.now();
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

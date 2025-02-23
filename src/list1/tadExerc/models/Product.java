package list1.tadExerc.models;

public class Product {
    private String productName;
    private double price;
    private int productID;
    private int stock;

    public Product(String productName, int productID, double price, int stock) {
        this.productName = productName;
        this.price = price;
        this.productID = productID;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "ProductItem{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", productID=" + productID +
                ", stock=" + stock +
                '}';
    }
}

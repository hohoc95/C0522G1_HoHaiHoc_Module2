package ss12_java_collection_framework.exercise.array_list.model;

public class Product {
    private int id;
    private String productName;
    private double price;

    public Product(){
    }

    public Product(int id, String productName, double price) {
        this.productName = productName;
        this.id = id;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product" +
                " Id: " + getId() +
                ", productName: '" + getProductName()  +
                ", price: '" + getPrice() ;
    }
}

package ss12_java_collection_framework.exercise.array_list.model;

public class Product {
    private String productName;
    private int id;
    private String dateOfManufacture;
    private String producer;
    private double price;

    public Product(int id, String name, double price){
    }

    public Product(String productName, int id, String dateOfManufacture, String producer, double price) {
        this.productName = productName;
        this.id = id;
        this.dateOfManufacture = dateOfManufacture;
        this.producer = producer;
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

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
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
                "productName: '" + getProductName() + '\'' +
                ", Id= " + getId() +
                ", dateOfManufacture:'" + getDateOfManufacture() + '\'' +
                ", producer: '" + getProducer() + '\'' +
                ", price: '" + getPrice() + '\'';
    }
}

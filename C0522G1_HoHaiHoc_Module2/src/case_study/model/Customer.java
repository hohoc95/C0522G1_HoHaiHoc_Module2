package case_study.model;

public class Customer extends Person{
    private String customerCode;
    private String kindOfCustomer;
    private String addressCustomer;

    public Customer(int id, String name, String dateOfBirth, String gender, String email, String phoneNumber, String customerCode, String kindOfCustomer, String addressCustomer) {
        super(id, name, dateOfBirth, gender, email, phoneNumber);
        this.customerCode = customerCode;
        this.kindOfCustomer = kindOfCustomer;
        this.addressCustomer = addressCustomer;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getKindOfCustomer() {
        return kindOfCustomer;
    }

    public void setKindOfCustomer(String kindOfCustomer) {
        this.kindOfCustomer = kindOfCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    @Override
    public String toString() {
        return "Customer" +
                "customerCode='" + customerCode + '\'' +
                ", kindOfCustomer='" + kindOfCustomer + '\'' +
                ", addressCustomer='" + addressCustomer + '\'' +
                "} " + super.toString();
    }
}

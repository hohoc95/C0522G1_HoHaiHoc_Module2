package case_study.model;

public class Customer extends Person{
    private String customerCode;
    private String kindOfCustomer;
    private String addressCustomer;

    public Customer(String id, String name, String dateOfBirth, String gender, String email,
                    String phoneNumber, String customerCode, String kindOfCustomer, String addressCustomer) {
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

    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s\n",this.getId(),this.getName(),this.getDateOfBirth(),
                this.getGender(),this.getEmail(),this.getPhoneNumber(),this.getCustomerCode(),
                this.getKindOfCustomer(),this.getAddressCustomer());
    }

    @Override
    public String toString() {
        return "Customer: "+ super.toString() +
                ", customerCode: " + customerCode +
                ", kindOfCustomer: " + kindOfCustomer +
                ", addressCustomer: " + addressCustomer ;
    }
}

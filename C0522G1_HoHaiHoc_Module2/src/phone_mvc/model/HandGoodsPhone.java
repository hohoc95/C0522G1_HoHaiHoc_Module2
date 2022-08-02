package phone_mvc.model;

public class HandGoodsPhone extends Phone{
    private String portableCountry;
    private String StatusPhone;

    public HandGoodsPhone(){
    }

    public HandGoodsPhone(int phoneId, String phoneName, int price, int amount, String producer,
                          String portableCountry, String statusPhone) {
        super(phoneId, phoneName, price, amount, producer);
        this.portableCountry = portableCountry;
        StatusPhone = statusPhone;
    }

    public String getPortableCountry() {
        return portableCountry;
    }

    public void setPortableCountry(String portableCountry) {
        this.portableCountry = portableCountry;
    }

    public String getStatusPhone() {
        return StatusPhone;
    }

    public void setStatusPhone(String statusPhone) {
        StatusPhone = statusPhone;
    }

    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s,%s\n",this.getPhoneId(),this.getPhoneName(),
                this.getPrice(),this.getAmount(),this.getProducer(),this.getPortableCountry(),this.getStatusPhone());
    }

    @Override
    public String toString() {
        return "HandGoodsPhone: " + super.toString() +
                "portableCountry: " + portableCountry +
                ", StatusPhone: " + StatusPhone;
    }
}

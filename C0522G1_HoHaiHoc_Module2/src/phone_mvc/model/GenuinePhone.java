package phone_mvc.model;

public class GenuinePhone extends Phone{
    private int warrantyPeriod;
    private String warrantyCoverage;

    public GenuinePhone(){
    }

    public GenuinePhone(int phoneId, String phoneName, int price, int amount,
                        String producer, int warrantyPeriod, String warrantyCoverage) {
        super(phoneId, phoneName, price, amount, producer);
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyCoverage = warrantyCoverage;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyCoverage() {
        return warrantyCoverage;
    }

    public void setWarrantyCoverage(String warrantyCoverage) {
        this.warrantyCoverage = warrantyCoverage;
    }

    @Override
    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s,%\n",getPhoneId(),getPhoneName(),getPrice(),
                getAmount(),getProducer(),getWarrantyPeriod(),getWarrantyCoverage());
    }
//    public String getInfo(){
//        return String.format("%s,%s,%s,%s,%s,%s,%\n",this.getPhoneId(),this.getPhoneName(),this.getPrice(),
//                this.getAmount(),this.getProducer(),this.getWarrantyPeriod(),this.getWarrantyCoverage());
//    }

    @Override
    public String toString() {
        return "GenuinePhone: " + super.toString()+
                ", warrantyPeriod: " + warrantyPeriod +
                ", warrantyCoverage: " + warrantyCoverage + super.toString();
    }
}

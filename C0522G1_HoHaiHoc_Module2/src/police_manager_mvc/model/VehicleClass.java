package police_manager_mvc.model;

public abstract class VehicleClass {
    /**
     * vehicleNumber: Biển kiểm soát.
     * producer: Tên hãng sản xuất.
     * yearOfManufacture: Năm sản xuất.
     * Owner: Chủ sở hữu.
     */
    private String vehicleNumber;
    private String producer;
    private String yearOfManufacture;
    private String owner;

    public VehicleClass(){
    }

    public VehicleClass(String licensePlates, String producer, String yearOfManufacture, String owner) {
        this.vehicleNumber = licensePlates;
        this.producer = producer;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
    }

    public String getLicensePlates() {
        return vehicleNumber;
    }

    public void setLicensePlates(String licensePlates) {
        this.vehicleNumber = licensePlates;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "VehicleClass{" +
                "licensePlates='" + vehicleNumber + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfManufacture='" + yearOfManufacture + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

    public  String getVehicleNumber(){
        return  vehicleNumber;
    }
}

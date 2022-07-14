package police_manager_mvc.model;

public abstract class VehicleClass {
    /**
     * licensePlates: Biển kiểm soát.
     * producer: Tên hãng sản xuất.
     * yearOfManufacture: Năm sản xuất.
     * Owner: Chủ sở hữu.
     */
    private String licensePlates;
    private String producer;
    private String yearOfManufacture;
    private String owner;

    public VehicleClass(){
    }

    public VehicleClass(String licensePlates, String producer, String yearOfManufacture, String owner) {
        this.licensePlates = licensePlates;
        this.producer = producer;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
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
                "licensePlates='" + licensePlates + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfManufacture='" + yearOfManufacture + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}

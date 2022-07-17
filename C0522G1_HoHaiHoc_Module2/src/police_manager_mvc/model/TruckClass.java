package police_manager_mvc.model;

public class TruckClass extends VehicleClass {
    private double tonnage;

    public TruckClass(String licensePlates, String producer, String yearOfManufacture, String owner, double tonnage) {
        super(licensePlates, producer, yearOfManufacture, owner);
        this.tonnage = tonnage;
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "TruckClass{" +
                "tonnage=" + tonnage +
                "} " + super.toString();
    }
}

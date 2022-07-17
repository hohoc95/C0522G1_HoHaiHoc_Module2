package police_manager_mvc.model;

public class MotorbikeClass extends VehicleClass {
    private double wattage;

    public MotorbikeClass(){
    }

    public MotorbikeClass(String licensePlates, String producer, String yearOfManufacture, String owner, double wattage) {
        super(licensePlates, producer, yearOfManufacture, owner);
        this.wattage = wattage;
    }

    public double getWattage() {
        return wattage;
    }

    public void setWattage(double wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "MotorbikeClass{" +
                "wattage=" + wattage +
                "} " + super.toString();
    }
}

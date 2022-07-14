package police_manager_mvc.model;

public class CarClass  extends VehicleClass{
    private int numberOfSeats;
    private String vehicleType;

    public CarClass(){
    }

    public CarClass(int numberOfSeats, String vehicleType) {
        this.numberOfSeats = numberOfSeats;
        this.vehicleType = vehicleType;
    }

    public CarClass(String licensePlates, String producer, String yearOfManufacture, String owner, int numberOfSeats, String vehicleType) {
        super(licensePlates, producer, yearOfManufacture, owner);
        this.numberOfSeats = numberOfSeats;
        this.vehicleType = vehicleType;
    }

}

package case_study.model;

public class House extends Facility{
    private String roomStandard;
    private int floor;

    public House(){
    }

    public House(String serviceCode, String nameService, double usabeArea, double rentalCosts, int maximumPeople,
                 String leaseType, String roomStandard, int floor) {
        super(serviceCode, nameService, usabeArea, rentalCosts, maximumPeople, leaseType);
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",this.getServiceCode(),this.getNameService(),
                this.getUsabeArea(), this.getRentalCosts(), this.getMaximumPeople(), this.getLeaseType(),
                this.getRoomStandard(), this.getFloor());
    }

    @Override
    public String toString() {
        return "House: " + super.toString() +
                ", roomStandard: " + roomStandard +
                ", floors: " + floor;
    }
}

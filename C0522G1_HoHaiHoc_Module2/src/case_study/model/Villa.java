package case_study.model;

public class Villa extends Facility{
    private String roomStandard;
    private double poolArea;
    private int floor;

    public Villa(){
    }

    public Villa(String serviceCode, String nameService, double usabeArea, double rentalCosts, int maximumPeople,
                 String leaseType, String roomStandard, double poolArea, int floor) {
        super(serviceCode, nameService, usabeArea, rentalCosts, maximumPeople, leaseType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",this.getServiceCode(), this.getNameService(),
                this.getUsabeArea(), this.getRentalCosts(), this.getMaximumPeople(), this.getLeaseType(),
                this.getRoomStandard(), this.getPoolArea(), this.getFloor());
    }

    @Override
    public String toString() {
        return "Villa: " + super.toString() +
                ", roomStandar: " + roomStandard +
                ", poolArea: " + poolArea +
                ", floors: " + floor ;
    }
}

package case_study.model;

public class Villa extends Facility{
    private String roomStandard;
    private double poolArea;
    private int floors;

    public Villa(){
    }

    public Villa(String nameService, double usabeArea, double rentalCosts, int maximumPeople, String leaseType, String roomStandar, double poolArea, int floors) {
        super(nameService, usabeArea, rentalCosts, maximumPeople, leaseType);
        this.roomStandard = roomStandar;
        this.poolArea = poolArea;
        this.floors = floors;
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

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s\n", this.getNameService(), this.getUsabeArea(), this.getRentalCosts(), this.getMaximumPeople(), this.getLeaseType(), this.getRoomStandard(), this.getPoolArea(), this.getFloors());
    }

    @Override
    public String toString() {
        return "Villa: " +
                "roomStandar='" + roomStandard +
                ", poolArea=" + poolArea +
                ", floors=" + floors + super.toString();
    }
}

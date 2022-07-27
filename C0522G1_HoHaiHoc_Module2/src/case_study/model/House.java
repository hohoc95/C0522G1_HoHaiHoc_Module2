package case_study.model;

public class House extends Facility{
    private String roomStandard;
    private int floors;

    public House(){
    }

    public House(String nameService, double usabeArea, double rentalCosts, int maximumPeople, String leaseType, String roomStandard, int floors) {
        super(nameService, usabeArea, rentalCosts, maximumPeople, leaseType);
        this.roomStandard = roomStandard;
        this.floors = floors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s,%s\n", this.getNameService(), this.getUsabeArea(), this.getRentalCosts(), this.getMaximumPeople(), this.getLeaseType(), this.getRoomStandard(),this.getFloors());
    }

    @Override
    public String toString() {
        return "House: " +
                "roomStandard='" + roomStandard +
                ", floors=" + floors +
                super.toString();
    }
}

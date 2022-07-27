package case_study.model;

public class Room extends Facility{
    private String freeService;

    public Room(){
    }

    public Room(String nameService, double usabeArea, double rentalCosts, int maximumPeople, String leaseType, String freeService) {
        super(nameService, usabeArea, rentalCosts, maximumPeople, leaseType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s\n", this.getNameService(), this.getUsabeArea(), this.getRentalCosts(), this.getMaximumPeople(), this.getLeaseType(), this.getFreeService());
    }

    @Override
    public String toString() {
        return "Room: " +
                "freeService: " + freeService +
                super.toString();
    }
}

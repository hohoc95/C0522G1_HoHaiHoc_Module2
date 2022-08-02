package case_study.model;

public abstract class Facility {
    private String serviceCode;
    private String nameService;
    private double usabeArea;
    private double rentalCosts;
    private int maximumPeople;
    private String leaseType;

    public Facility(){
    }

    public Facility(String serviceCode, String nameService, double usabeArea, double rentalCosts, int maximumPeople, String leaseType) {
        this.serviceCode = serviceCode;
        this.nameService = nameService;
        this.usabeArea = usabeArea;
        this.rentalCosts = rentalCosts;
        this.maximumPeople = maximumPeople;
        this.leaseType = leaseType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUsabeArea() {
        return usabeArea;
    }

    public void setUsabeArea(double usabeArea) {
        this.usabeArea = usabeArea;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getLeaseType() {
        return leaseType;
    }

    public void setLeaseType(String leaseType) {
        this.leaseType = leaseType;
    }

    @Override
    public String toString() {
        return getServiceCode() +
                ", nameService: " + getNameService() +
                ", usabeArea: " + getUsabeArea() +
                ", rentalCosts: " + getRentalCosts() +
                ", maximumPeople: " + getMaximumPeople() +
                ", leaseType: " + getLeaseType();
    }



}

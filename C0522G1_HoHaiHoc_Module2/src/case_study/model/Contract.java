package case_study.model;

public class Contract {
    private String contractNumber;
    private String bookingCode;
    private String depositAmount;
    private String totalPayment;
    private String customerCode;

    public Contract(){
    }

    public Contract(String contractNumber, String bookingCode, String depositAmount,
                    String totalPayment, String customerCode) {
        this.contractNumber = contractNumber;
        this.bookingCode = bookingCode;
        this.depositAmount = depositAmount;
        this.totalPayment = totalPayment;
        this.customerCode = customerCode;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(String depositAmount) {
        this.depositAmount = depositAmount;
    }

    public String getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(String totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public String toString() {
        return "Contract: " +
                "contractNumber: " + getContractNumber()  +
                ", bookingCode: " + getBookingCode() +
                ", depositAmount: " + getDepositAmount() +
                ", totalPayment: " + getTotalPayment() +
                ", customerCode: " + getCustomerCode() ;
    }
}
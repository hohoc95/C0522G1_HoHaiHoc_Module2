package bank_mvc.model;

public abstract class BankAccount {
    private int accountID;
    private String accountCode;
    private String accountName;
    private String dayOfCreate;

    public BankAccount(){
    }

    public BankAccount(int accountID, String accountCode, String accountName, String dayOfCreate) {
        this.accountID = accountID;
        this.accountCode = accountCode;
        this.accountName = accountName;
        this.dayOfCreate = dayOfCreate;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getDayOfCreate() {
        return dayOfCreate;
    }

    public void setDayOfCreate(String dayOfCreate) {
        this.dayOfCreate = dayOfCreate;
    }

    @Override
    public String toString() {
        return "BankAccount: " +
                "accountID: " + accountID +
                ", accountCode: " + accountCode +
                ", accountName: " + accountName +
                ", dayOfCreate: " + dayOfCreate;
    }
}

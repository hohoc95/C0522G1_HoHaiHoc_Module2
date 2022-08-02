package bank_mvc.model;

public class SavingAccount extends BankAccount{
    private String savingDepositAmount;
    private String savingDay;
    private int interestRate;
    private String term;

    public SavingAccount(){
    }

    public SavingAccount(int accountID, String accountCode, String accountName, String dayOfCreate,
                         String savingDepositAmount, String savingDay, int interestRate, String term) {
        super(accountID, accountCode, accountName, dayOfCreate);
        this.savingDepositAmount = savingDepositAmount;
        this.savingDay = savingDay;
        this.interestRate = interestRate;
        this.term = term;
    }

    public String getSavingDepositAmount() {
        return savingDepositAmount;
    }

    public void setSavingDepositAmount(String savingDepositAmount) {
        this.savingDepositAmount = savingDepositAmount;
    }

    public String getSavingDay() {
        return savingDay;
    }

    public void setSavingDay(String savingDay) {
        this.savingDay = savingDay;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s\n", this.getAccountID(),this.getAccountCode(),
                this.getAccountName(),this.getDayOfCreate(),this.getSavingDepositAmount(),this.getSavingDay(),
                this.getInterestRate(),this.getTerm());
    }

    @Override
    public String toString() {
        return "SavingAccount: " +
                "savingDepositAmount: " + savingDepositAmount +
                ", savingDay: " + savingDay +
                ", interestRate: " + interestRate +
                ", term: " + term + super.toString();
    }
}

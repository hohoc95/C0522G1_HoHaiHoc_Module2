package bank_mvc.model;

public class PaymentAccount extends BankAccount{
    private String cardNumber;
    private String accountAmount;

    public PaymentAccount(){
    }

    public PaymentAccount(int accountID, String accountCode, String accountName,
                          String dayOfCreate, String cardNumber, String accountAmount) {
        super(accountID, accountCode, accountName, dayOfCreate);
        this.cardNumber = cardNumber;
        this.accountAmount = accountAmount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(String accountAmount) {
        this.accountAmount = accountAmount;
    }

    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s\n",this.getAccountID(),this.getAccountCode(),
                this.getAccountName(),this.getDayOfCreate(),this.getCardNumber(),this.getDayOfCreate());
    }

    @Override
    public String toString() {
        return "PaymentAccount: " +
                "cardNumber: " + cardNumber +
                ", accountAmount: " + accountAmount + super.toString();
    }
}

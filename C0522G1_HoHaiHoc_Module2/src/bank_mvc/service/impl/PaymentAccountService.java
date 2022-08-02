package bank_mvc.service.impl;

import bank_mvc.model.PaymentAccount;
import bank_mvc.service.IPaymentAccountService;
import bank_mvc.utils.WriteFile;
import bank_mvc.utils.ReadFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PaymentAccountService implements IPaymentAccountService {
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH_PAYMENT_ACCOUNT = "C0522G1_HoHaiHoc_Module2/src/bank_mvc/data/paymentAccount.csv";
    private static List<PaymentAccount> paymentAccountList = new ArrayList<>();

    public void writeFile(){
        WriteFile.writePaymentAccount(PATH_PAYMENT_ACCOUNT, paymentAccountList);
    }
    public void readFile(){
        List<PaymentAccount> list = ReadFile.readPaymentAccount(PATH_PAYMENT_ACCOUNT);
        paymentAccountList.clear();
        paymentAccountList.addAll(list);
    }

    @Override
    public void add() {
        readFile();
        int accountID = paymentAccountList.get(paymentAccountList.size() - 1).getAccountID() + 1;
        System.out.println("Enter Account code: ");
        String accountCode = scanner.nextLine();

        System.out.println("Enter Account name: ");
        String accountName = scanner.nextLine();

        System.out.println("Enter Day of created: ");
        String dayOfCreate = scanner.nextLine();

        System.out.println("Enter Card number: ");
        String cardNumber = scanner.nextLine();

        System.out.println("Enter Account Amount: ");
        String accountAmount = scanner.nextLine();

        paymentAccountList.add(new PaymentAccount(accountID,accountCode,accountName,
                dayOfCreate,cardNumber,accountAmount));
        System.out.println("Add successfull!");

        writeFile();
    }

    @Override
    public void remove() {
        readFile();
        System.out.println("Enter Account code : ");
        String accountCodeRemove =scanner.nextLine();
        boolean isFlag = false;

        for (PaymentAccount paymentAccount: paymentAccountList){
            if(accountCodeRemove.equals(paymentAccount.getAccountCode())){
                System.out.println("Are you sure you want to remove it?? \n" +
                        "1. Yes \n" +
                        "2. No");
                String chooseYesNo = scanner.nextLine();
                if(chooseYesNo.equals("1")  ){
                    paymentAccountList.remove(paymentAccount);
                    System.out.println("Remove successfull.");
                    writeFile();
                }
                isFlag = true;
                break;
            }
        }
        if(!isFlag){
            System.out.println("Not found.");
        }
    }

    @Override
    public void displayList() {
        readFile();
        for(PaymentAccount paymentAccount : paymentAccountList){
            System.out.println(paymentAccount);
        }
    }

    @Override
    public void searchByName() {
        readFile();
        System.out.println("Enter Account name: ");
        String name = scanner.nextLine();
        boolean flag = false;
        for (PaymentAccount paymentAccount : paymentAccountList) {
            if (paymentAccount.getAccountName().contains(name)) {
                System.out.println(paymentAccount);
                flag = true;
            }
        }
        if (!flag){
            System.err.println("Not found!");
        }
    }

    @Override
    public void searchByID() {
        readFile();
        boolean isSwap = true;
        for (int i = 0; i < paymentAccountList.size() && isSwap; i++) {
            isSwap = false;

            for (int j = 0; j < paymentAccountList.size()-1-i; j++) {
                if (paymentAccountList.get(j).getAccountName().compareTo(paymentAccountList.get(j+1).getAccountName()) > 0){
                    Collections.swap(paymentAccountList,j,j+1);
                    isSwap = true;
                }
            }
        }
        System.out.println("Sorted list\n: ");
        for (int i = 0; i < paymentAccountList.size(); i++) {
            System.out.println(paymentAccountList.get(i) + "\n");
        }
        writeFile();
    }
}

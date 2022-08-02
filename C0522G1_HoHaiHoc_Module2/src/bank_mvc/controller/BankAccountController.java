package bank_mvc.controller;


import java.util.Scanner;

public class BankAccountController {
    public static void menuBankAccount(){
        PaymentAccountController paymentAccountController = new PaymentAccountController();
        SavingAccountController savingAccountController = new SavingAccountController();

        Scanner scanner = new Scanner(System.in);

        do {
            int choice = 0;
            System.out.println("Bank account management system\n" +
                    "1. Payment Account\n" +
                    "2. Saving Account\n" +
                    "3. Exit\n");

            try{
                System.out.print("You choice: ");
                choice = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e){
                System.out.println("Pls, re-enter a integer");
                e.printStackTrace();
            }
            switch (choice){
                case 1 :
                    paymentAccountController.paymentAccountManagement();
                    break;
                case 2:
                    savingAccountController.savingAccountManagement();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.err.println("The number you entered is incorrect, please re-enter");
            }
        }while (true);
    }
}

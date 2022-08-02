package bank_mvc.controller;

import bank_mvc.service.IPaymentAccountService;
import bank_mvc.service.impl.PaymentAccountService;

import java.util.Scanner;

public class PaymentAccountController {
    public void paymentAccountManagement(){
        Scanner scanner = new Scanner(System.in);
        IPaymentAccountService iPaymentAccountService = new PaymentAccountService();
        do {
            int choice = 0;
            System.out.println("1. Add new Payment account.\n" +
                    "2. Remove Payment account.\n" +
                    "3. Display list Payment account.\n" +
                    "4. Sort account by name\n" +
                    "5. Sort account by ID\n" +
                    "6. Return main menu.\n");
            try{
                System.out.print("You choice: ");
                choice = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e){
                System.out.println("Pls, re-enter a integer");
                e.printStackTrace();
            }
            switch (choice){
                case 1:
                    iPaymentAccountService.add();
                    break;
                case 2:
                    iPaymentAccountService.remove();
                    break;
                case 3:
                    iPaymentAccountService.displayList();
                    break;
                case 4:
                    iPaymentAccountService.searchByName();
                    break;
                case 5:
                    iPaymentAccountService.searchByName();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("The number you entered is not correct, please re-enter");

            }
        }while (true);
    }
}

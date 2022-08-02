package bank_mvc.controller;

import bank_mvc.service.ISavingAccountService;
import bank_mvc.service.impl.SavingAccountService;

import java.util.Scanner;

public class SavingAccountController {
    public void savingAccountManagement(){
        Scanner scanner = new Scanner(System.in);
        ISavingAccountService iSavingAccountService = new SavingAccountService();
        do{
            int choice = 0;
            System.out.println("1. Add new Saving account.\n" +
                    "2. Remove Saving account.\n" +
                    "3. Display list Saving account.\n" +
                    "4. Sort account by name.\n" +
                    "5. Sort account by Id.\n" +
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
                    iSavingAccountService.add();
                    break;
                case 2:
                    iSavingAccountService.remove();
                    break;
                case 3:
                    iSavingAccountService.displayList();
                    break;
                case 4:
                    iSavingAccountService.searchByName();
                    break;
                case 5:
                    iSavingAccountService.searchByID();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("The number you entered is not correct, please re-enter");
            }
        }while (true);
    }
}

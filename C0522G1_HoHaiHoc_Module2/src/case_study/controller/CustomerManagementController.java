package case_study.controller;

import java.util.Scanner;

public class CustomerManagementController {
    private Scanner scanner = new Scanner(System.in);

    public void customerManagement(){
        do {
            int choice;
            System.out.print("1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu\n");

            System.out.print("You choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                case 2:
                case 3:
                case 4: return;
            }

        }while (true);
    }
}

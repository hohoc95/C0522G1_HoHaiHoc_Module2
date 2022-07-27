package case_study.controller;

import java.util.Scanner;

public class PromotionManagementController {
    private Scanner scanner = new Scanner(System.in);

    public void promotionManagement(){
        do {
            int choice;
            System.out.println("1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn main menu\n");

            System.out.print("You choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                case 2:
                case 3:
                case 4: return;
            }
        }
        while (true);
    }

}

package case_study.controller;

import java.util.Scanner;

public class BookingManagementController {
    private Scanner scanner = new Scanner(System.in);

    public void bookingManagement(){
        do {
            int choice;

            System.out.print("1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new constracts\n" +
                    "4.\tDisplay list contracts\n" +
                    "5.\tEdit contracts\n" +
                    "6.\tReturn main menu\n");

            System.out.print("You choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    return;
                default:
                    System.out.println("The number you entered is not correct, please re-enter");
            }

        }while (true);
    }

}

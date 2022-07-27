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
                case 2:
                case 3:
                case 4: return;
            }

        }while (true);
    }

}

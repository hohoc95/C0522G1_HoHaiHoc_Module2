package case_study.controller;

import java.util.Scanner;

public class FacilityManagementController {
    private Scanner scanner = new Scanner(System.in);

    public void facilityManagement(){
        do {
            int choice;
            System.out.print("1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n");

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

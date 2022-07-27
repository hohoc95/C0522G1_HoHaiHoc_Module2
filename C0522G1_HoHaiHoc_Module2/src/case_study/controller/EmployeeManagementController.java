package case_study.controller;

import java.util.Scanner;

public class EmployeeManagementController {
    private Scanner scanner = new Scanner(System.in);

    public void employeeManagement(){
        do {
            int choice;
            System.out.println("1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tEdit employee\n" +
                    "4\tReturn main menu\n");

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

package case_study.controller;

import java.util.Scanner;

public class FurumaController {
    public static void menuController(){
        Scanner scanner = new Scanner(System.in);
        int choice;

        EmployeeManagementController employeeManagementController = new EmployeeManagementController();
        CustomerManagementController customerManagementController = new CustomerManagementController();
        FacilityManagementController facilityManagementController = new FacilityManagementController();
        BookingManagementController bookingManagementController = new BookingManagementController();
        PromotionManagementController promotionManagementController = new PromotionManagementController();

        do {
            System.out.println("Furuma\n" +
                    "1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management \n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "6.Exit\n");

            System.out.print("You choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6: System.exit(1);
            }
        }
        while (true);
    }
}

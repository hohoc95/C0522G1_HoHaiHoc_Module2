package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    public static void menuController(){
        Scanner scanner = new Scanner(System.in);

        EmployeeManagementController employeeManagementController = new EmployeeManagementController();
        CustomerManagementController customerManagementController = new CustomerManagementController();
        FacilityManagementController facilityManagementController = new FacilityManagementController();
        BookingManagementController bookingManagementController = new BookingManagementController();
        PromotionManagementController promotionManagementController = new PromotionManagementController();

        do {
            int choice;
            System.out.println("Furama\n" +
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
                    employeeManagementController.employeeManagement();
                    break;
                case 2:
                    customerManagementController.customerManagement();
                    break;
                case 3:
                    facilityManagementController.facilityManagement();
                    break;
                case 4:
                    bookingManagementController.bookingManagement();
                    break;
                case 5:
                    promotionManagementController.promotionManagement();
                    break;
                case 6: System.exit(0);
                default:
                    System.err.println("The number you entered is incorrect, please re-enter");
            }
        }
        while (true);
    }
}

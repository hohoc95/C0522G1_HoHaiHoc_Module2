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
            System.out.println("Hệ thống quản lý Furama\n" +
                    "1.Quản lý nhân sự\n" +
                    "2.Quản lý khách hàng\n" +
                    "3.Quản lý cơ sở \n" +
                    "4.Quản lý đặt chổ (booking)\n" +
                    "5.Quản lý thăng hạng (promotion)\n" +
                    "6.Exit\n");

            System.out.print("Lựa chọn của bạn: ");
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
                case 6:
                    System.exit(0);
                default:
                    System.err.println("Số bạn vừa nhập không đúng, hãy nhập lại.");
            }
        }
        while (true);
    }
}

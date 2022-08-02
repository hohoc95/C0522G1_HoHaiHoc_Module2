package case_study.controller;

import case_study.service.ICustomerService;
import case_study.service.impl.CustomerService;

import java.util.Scanner;

public class CustomerManagementController {
    public void customerManagement(){
        Scanner scanner = new Scanner(System.in);
        ICustomerService iCustomerService = new CustomerService();
        do {
            int choice = 0;
            System.out.println("1.\tDanh sách khách hàng\n" +
                    "2.\tThêm mới khách hàng\n" +
                    "3.\tChỉnh sửa khách hàng\n" +
                    "4.\tTrờ về menu chính\n");

            try{
                System.out.println("Nhập vào lựa chọn của bạn: ");
                choice = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e){
                System.out.println("Hãy nhập kiểu số");
                e.printStackTrace();
            }

            switch (choice){
                case 1:
                    iCustomerService.displayList();
                    break;
                case 2:
                    iCustomerService.add();
                    break;
                case 3:
                    iCustomerService.edit();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Số bạn vừa nhập không tồn tại, hãy nhập lại");
            }
        }while (true);
    }
}
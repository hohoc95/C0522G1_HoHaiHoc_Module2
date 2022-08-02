package case_study.controller;

import case_study.service.IEmployeeService;
import case_study.service.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeManagementController {
    public void employeeManagement(){
        Scanner scanner = new Scanner(System.in);
        IEmployeeService iEmployeeService = new EmployeeService();
        do {
            int choice = 0;
            System.out.println("1.\tDanh sách nhân viên\n" +
                    "2.\tThêm mới nhân viên\n" +
                    "3.\tChỉnh sửa nhân viên\n" +
                    "4.\tTrở về menu chính\n");

            try{
                System.out.print("Nhập vào lựa chọn của bạn: ");
                choice = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e){
                System.out.println("Hãy nhập kiểu số");
                e.printStackTrace();
            }

            switch (choice){
                case 1:
                    iEmployeeService.displayList();
                    break;
                case 2:
                    iEmployeeService.add();
                    break;
                case 3:
                    iEmployeeService.edit();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Số bạn vừa nhập không đúng, hãy nhập lại.");
            }
        }
        while (true);
    }
}
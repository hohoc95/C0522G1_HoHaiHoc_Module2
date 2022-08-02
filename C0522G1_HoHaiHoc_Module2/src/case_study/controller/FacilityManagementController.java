package case_study.controller;

import case_study.service.IFacilityService;
import case_study.service.impl.FacilityService;

import java.util.Scanner;

public class FacilityManagementController {
    public void facilityManagement(){
        Scanner scanner = new Scanner(System.in);
        IFacilityService iFacilityService = new FacilityService();
        do {
            int choice = 0;
            System.out.print("1\tHiển thị danh sách cơ sở\n" +
                    "2\tThêm mới cơ sở\n" +
                    "3\tTrở về menu chính\n");

            try{
                System.out.print("Lựa chọn của bạn: ");
                choice = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e){
                System.out.println("Hãy nhập kiểu số");
                e.printStackTrace();
            }

            switch (choice){
                case 1:
                    iFacilityService.displayList();
                    break;
                case 2:
                    iFacilityService.add();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Số bạn vừa nhập không đúng, hãy nhập lại");
            }

        }while (true);
    }

}

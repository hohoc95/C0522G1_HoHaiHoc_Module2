package police_manager_mvc.controller;

import police_manager_mvc.service.IVehicleService;
import police_manager_mvc.service.impl.MotorbikeService;

import java.util.Scanner;

public class MotorbikeController {
    private IVehicleService iVehicleService = (IVehicleService) new MotorbikeService() ;
    private Scanner scanner =  new Scanner(System.in);
    public void optionMotorbike(){
        do{
            System.out.println("Chọn chức năng: \n" +
                    "1. Thêm mới phương tiện.\n" +
                    "2. Hiển thị phương tiện\n" +
                    "3. Xoá phương tiện.\n" +
                    "4. Tìm kiếm theo biển số xe.\n" +
                    "5. Thoát");

            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose){
                case 1:
                    iVehicleService.add();
                    break;
                case 2:
                    iVehicleService.displayList();
                    break;
                case 3:
                    iVehicleService.remove();
                    break;
                case 4:
                    iVehicleService.searchVehicleNumber();
                case 5:
                    return;
            }
        }
        while (true);

    }
}

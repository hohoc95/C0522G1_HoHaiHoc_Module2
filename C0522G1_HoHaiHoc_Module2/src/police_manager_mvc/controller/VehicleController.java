package police_manager_mvc.controller;

import java.util.Scanner;

public class VehicleController {
    public static void menuController(){
        Scanner scanner = new Scanner(System.in);
        CarController carController = new CarController();
        MotorbikeController motorbikeController = new MotorbikeController();
        TruckController truckController = new TruckController();

        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG\n" +
                    "Chọn danh mục:\n" +
                    "1. Quản lý oto.\n" +
                    "2. Quản lý xe tải.\n" +
                    "3. Quản lý xe máy.\n" +
                    "4. Thoát");

            System.out.println("Nhập vào lựa chọn:  ");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:{
                    carController.optionCar();
                    break;
                }
                case 2:{
                    truckController.optionTruck();
                    break;
                }
                case 3:{
                    motorbikeController.optionMotorbike();
                    break;
                }
                case 4:{
                    System.exit(1);
                }

            }

        }while (true);
    }
}

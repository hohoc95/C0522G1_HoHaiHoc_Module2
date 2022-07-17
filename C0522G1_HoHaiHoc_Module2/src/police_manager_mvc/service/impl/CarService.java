package police_manager_mvc.service.impl;

import police_manager_mvc.model.CarClass;
import police_manager_mvc.service.IVehicleService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarService implements IVehicleService {

    private static List<CarClass> carClassList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        CarClass carClass = infoCar();
        carClassList.add(carClass);
        System.out.println("Thêm mới thành công.");

    }

    public static CarClass infoCar() {
        System.out.println("Nhập vào hãng sản xuất:  ");
        String manufacturerName = scanner.nextLine();
        System.out.println("Nhập vào năm sản xuất:  ");
        String yearOfManufacture = String.valueOf(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào chủ sở hữu:  ");
        String nameOfOwner = scanner.nextLine();
        System.out.println("Nhập vào kiểu xe:  ");
        String kindOfCar = scanner.nextLine();
        System.out.println("Nhập vào số chỗ ngồi:  ");
        int seat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào biển số xe:  ");
        String vehicleNumber = scanner.nextLine();
        CarClass carClass = new CarClass(vehicleNumber, manufacturerName, yearOfManufacture, nameOfOwner, seat, kindOfCar);
        return carClass;

    }

    @Override
    public void displayList() {
        for (CarClass carClass : carClassList) {
            System.out.println(carClass);
        }

    }

    @Override
    public void remove() {
        System.out.print("Nhập vào biển số xe cần xóa: ");
        String vehicalNumRemove = scanner.nextLine();
        boolean isExit = false;

        for (CarClass carClass : carClassList) {
            if (vehicalNumRemove.equals(carClass.getVehicleNumber())) {
                System.out.print("Bạn có chắc muốn xoá hay không:   \n" +
                        "1. Có\n" +
                        "2. Không");
                int choose = Integer.parseInt(scanner.nextLine());

                if (choose == 1) {
                    carClassList.remove(carClass);
                    System.out.print("Đã xoá thành công!  ");
                }

                isExit = true;
                break;
            }
        }
        if (!isExit) {
            System.out.println("Không tìm thấy!   ");

        }
    }

    @Override
    public void searchVehicleNumber() {
        System.out.println("Mời bạn nhập số xe cần tìm:  ");
        String vehicleNumberDisplay = scanner.nextLine();
        boolean isExit = false;

        for (CarClass carClass : carClassList) {
            if (vehicleNumberDisplay.equals(carClass.getVehicleNumber())) {
                System.out.println(carClass);
                isExit = true;
                return;
            }

        }
        if (isExit = false) {
            System.out.println("Không tìm thấy");
        }


    }
}

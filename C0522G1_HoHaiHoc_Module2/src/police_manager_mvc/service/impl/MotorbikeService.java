package police_manager_mvc.service.impl;

import police_manager_mvc.model.MotorbikeClass;
import police_manager_mvc.service.IVehicleService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotorbikeService implements IVehicleService {
    private static List<MotorbikeClass> motorbikeClassList = new ArrayList<MotorbikeClass>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        MotorbikeClass motorbikeClass = infoMotorbike();
        motorbikeClassList.add(motorbikeClass);
        System.out.print("Thêm mới thành công");
    }

    public static MotorbikeClass infoMotorbike() {
        System.out.println("Nhập vào hãng sản xuất:  ");
        String manufacturerName = scanner.nextLine();
        System.out.println("Nhập vào năm sản xuất:  ");
        String yearOfManufacture = String.valueOf(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào chủ sở hữu:  ");
        String nameOfOwner = scanner.nextLine();
        System.out.println("Nhập vào công suất:  ");
        int wattage = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào biển số xe:  ");
        String vehicleNumber = scanner.nextLine();
        MotorbikeClass motorbikeClass = new MotorbikeClass(vehicleNumber, manufacturerName, yearOfManufacture, nameOfOwner, wattage);
        return motorbikeClass;

    }

    @Override
    public void displayList() {
        for (MotorbikeClass motorbikeClass : motorbikeClassList) {
            System.out.print(motorbikeClass);
        }
    }

    @Override
    public void remove() {
        System.out.print("Nhập vào biển số xe cần xóa: ");
        String vehicalNumRemove = scanner.nextLine();
        boolean isExit = false;

        for (MotorbikeClass motorbikeClass : motorbikeClassList) {
            if (vehicalNumRemove.equals(motorbikeClass.getVehicleNumber())) {
                System.out.print("Bạn có chắc muốn xoá hay không: \n" +
                        "1. Có\n" +
                        "2. Không");
                int choose = Integer.parseInt(scanner.nextLine());

                if (choose == 1) {
                    motorbikeClassList.remove(motorbikeClass);
                    System.out.print("Đã xoá thành công!");
                }

                isExit = true;
                break;
            }
            if (!isExit) {
                System.out.print("Không tìm thấy!");
            }

        }
    }

    @Override
    public void searchVehicleNumber() {
        System.out.print("Nhập số xe cần tìm: ");
        String vehicleNumDisplay = scanner.nextLine();
        boolean isExit = false;

        for (MotorbikeClass motorbikeClass: motorbikeClassList) {
            if (vehicleNumDisplay.equals(motorbikeClass.getVehicleNumber())){
                System.out.print(motorbikeClass);
                isExit = true;
                return;
            }
        }
        if(isExit = false){
            System.out.print("Không tìm thấy.");
        }
    }
}

package police_manager_mvc.service.impl;

import police_manager_mvc.model.TruckClass;
import police_manager_mvc.service.IVehicleService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckService implements IVehicleService {
    private static List<TruckClass> truckClassList = new ArrayList<TruckClass>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        TruckClass truckClass = infoTruck();
        truckClassList.add(truckClass);
        System.out.print("Thêm mới thành công.");
    }

    public static TruckClass infoTruck() {
        System.out.println("Nhập vào hãng sản xuất:  ");
        String manufacturerName = scanner.nextLine();
        System.out.println("Nhập vào năm sản xuất:  ");
        String yearOfManufacture = scanner.nextLine();
        System.out.println("Nhập vào chủ sở hữu:  ");
        String nameOfOwner = scanner.nextLine();
        System.out.println("Nhập vào số tấn:  ");
        int tonnage = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số xe:  ");
        String vehicleNumber = scanner.nextLine();
        TruckClass truckClass = new TruckClass(vehicleNumber, manufacturerName, yearOfManufacture, nameOfOwner, tonnage);
        return truckClass;
    }

    @Override
    public void displayList() {
        for (TruckClass truckClass: truckClassList) {
            System.out.print(truckClass);
        }
    }

    @Override
    public void remove() {
        System.out.print("Nhập vào biển số xe cần xóa");
        String vehicleNumRemove = scanner.nextLine();
        boolean isExit = false;

        for (TruckClass truckClass: truckClassList) {
           if(vehicleNumRemove.equals(truckClass.getVehicleNumber())){
               System.out.print("Bạn có chắc là muốn xóa hay không: \n" +
                       "1. Có\n" +
                       "2. Không");

               int choose = Integer.parseInt(scanner.nextLine());

               if(choose == 1){
                   truckClassList.remove(truckClass);
                   System.out.print("Xóa thành công");
               }

               isExit = true;
               break;
           }
        }
    }

    @Override
    public void searchVehicleNumber() {
        System.out.print("Nhập số xe cần tìm: ");
        String vehicleNumDisplay = scanner.nextLine();
        boolean isExit = false;

        for (TruckClass truckClass: truckClassList) {
            if(vehicleNumDisplay.equals(truckClass.getVehicleNumber())){
                System.out.print(truckClass);
                isExit = true;
                return;
            }
        }
    }
}

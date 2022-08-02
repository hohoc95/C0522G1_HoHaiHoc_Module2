package phone_mvc.controller;


import java.util.Scanner;

public class PhoneController {
    public static void menuPhone(){
        GenuinePhoneController genuinePhoneController = new GenuinePhoneController();
        HandGoodsPhoneController handGoodsPhoneController = new HandGoodsPhoneController();

        Scanner scanner = new Scanner(System.in);

        do {
            int choice = 0;
            System.out.println("Hệ thống quản lý điện thoại: \n" +
                    "1. Điện thoại chính hãng \n" +
                    "2. Điện thoại xách tay\n" +
                    "3. Thoát\n");

            try{
                System.out.print("Nhập vào lựa chọn của bạn: ");
                choice = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e){
                System.out.println("Hãy nhập đúng kiểu số");
                e.printStackTrace();
            }
            switch (choice){
                case 1 :
                    genuinePhoneController.genuinePhoneController();
                    break;
                case 2:
                    handGoodsPhoneController.handGoodsPhoneController();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.err.println("Số bạn nhập không chính xác vui lòng nhập lại.");
            }
        }while (true);
    }
}

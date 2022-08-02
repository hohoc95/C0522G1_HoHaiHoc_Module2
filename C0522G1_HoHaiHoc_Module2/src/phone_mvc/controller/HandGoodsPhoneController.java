package phone_mvc.controller;

import phone_mvc.service.IHandGoodsPhoneService;
import phone_mvc.service.impl.HandGoodsPhoneService;

import java.util.Scanner;

public class HandGoodsPhoneController {
    public void handGoodsPhoneController(){
        Scanner scanner = new Scanner(System.in);
        IHandGoodsPhoneService iHandGoodsPhoneService = new HandGoodsPhoneService();
        do {
            int choice = 0;
            System.out.println("1. Thêm mới .\n" +
                    "2. Xóa.\n" +
                    "3. Xem danh sách điện thoại.\n" +
                    "4. Tìm kiếm\n" +
                    "5. Return main menu.\n");
            try{
                System.out.print("Nhập vào lựa chọn của bạn: ");
                choice = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e){
                System.out.println("Vui lòng nhập kiểu số: ");
                e.printStackTrace();
            }
            switch (choice){
                case 1:
                    iHandGoodsPhoneService.add();
                    break;
                case 2:
                    iHandGoodsPhoneService.remove();
                    break;
                case 3:
                    iHandGoodsPhoneService.displayList();
                    break;
                case 4:
                    iHandGoodsPhoneService.searchByName();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Số bạn vừa nhập không chính xác, hãy nhập lại");
            }
        }while (true);
    }

}

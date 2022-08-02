package phone_mvc.controller;


import phone_mvc.service.IGenuinePhoneService;
import phone_mvc.service.impl.GenuinePhoneService;

import java.util.Scanner;

public class GenuinePhoneController {
    public void genuinePhoneController(){
        Scanner scanner = new Scanner(System.in);
        IGenuinePhoneService iGenuinePhoneService = new GenuinePhoneService();
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
                    iGenuinePhoneService.add();
                    break;
                case 2:
                    iGenuinePhoneService.remove();
                    break;
                case 3:
                    iGenuinePhoneService.displayList();
                    break;
                case 4:
                    iGenuinePhoneService.searchByName();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Số bạn vừa nhập không chính xác, hãy nhập lại");
            }
        }while (true);
    }
}

package ss12_java_collection_framework.exercise.array_list.controller;

import ss12_java_collection_framework.exercise.array_list.service.IProductManager;

import java.util.Scanner;

public class ProductController {

    public void menuController() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM \n" +
                    "1. Thêm sản phẩm." +
                    "2. Xóa sản phẩm." +
                    "3. Chỉnh sửa sản phẩm." +
                    "4. Hiển thị sản phẩm." +
                    "5. Tìm kiếm sản phẩm." +
                    "6. Sắp xếp sản phẩm." );
            System.out.print("Nhập vào lựa chọn: ");

            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    //IProductManager.add();
                    break;
            }
        }while (true);

    }
}

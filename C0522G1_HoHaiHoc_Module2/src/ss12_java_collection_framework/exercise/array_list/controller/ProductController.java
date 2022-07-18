package ss12_java_collection_framework.exercise.array_list.controller;

import ss12_java_collection_framework.exercise.array_list.service.IProductManager;
import ss12_java_collection_framework.exercise.array_list.controller.ProductController;
import ss12_java_collection_framework.exercise.array_list.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    private static final Scanner scanner = new Scanner(System.in);
    private final IProductManager iProductManager = new ProductService();

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
                    iProductManager.add();
                    break;
                case 2:
                    iProductManager.remove();
                    break;
                case 3:
                    iProductManager.edit();
                    break;
                case 4:
                    iProductManager.displayList();
                    break;
                case 5:
                    iProductManager.findByName();
                    break;
                case 6:
                    iProductManager.sort();
                    break;
                case 7:
                    System.out.println("cảm ơn quý khách!");
                    System.exit(1);
            }
        }while (true);

    }
}

package ss17_binary_file_serialization.exercise.exercise1.controller;

import ss17_binary_file_serialization.exercise.exercise1.model.Product;
import ss17_binary_file_serialization.exercise.exercise1.service.IProductService;
import ss17_binary_file_serialization.exercise.exercise1.service.impl.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {
    private IProductService iProductService = new ProductService();

    public static void menuProduct(){
        List<Product> productList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        IProductService iProductService = new ProductService();

        int choice;
        do {
            System.out.print("1. Thêm sản phẩm\n" +
                    "2. Hiển thị danh sách sản phẩm\n" +
                    "3. Tìm sản phẩm theo tên\n" +
                    "4. Tìm sản phẩm theo Id\n" +
                    "5. Thoát\n");
            try {
                System.out.print("Nhập vào lựa chọn: ");
                choice = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e){
                System.out.print("Nhập chữ số.");
            }
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    iProductService.add();
                    break;
                case 2:
                    iProductService.displayMenu();
                    break;
                case 3:
                    iProductService.findByName();
                    break;
                case 4:
                    iProductService.findById();
                    break;
                case 5:
                    System.exit(1);
                default:
                    System.out.print("Lựa chọn không tồn tại, nhập lại: ");
            }
        }while (true);
    }

}

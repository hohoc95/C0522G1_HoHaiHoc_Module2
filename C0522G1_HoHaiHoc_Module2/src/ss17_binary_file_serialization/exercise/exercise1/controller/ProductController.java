package ss17_binary_file_serialization.exercise.exercise1.controller;

import ss17_binary_file_serialization.exercise.exercise1.model.Product;
import ss17_binary_file_serialization.exercise.exercise1.service.IProductService;
import ss17_binary_file_serialization.exercise.exercise1.service.impl.ProductService;
import ss17_binary_file_serialization.exercise.exercise1.utils.ReadWriteFileUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {
    public static void menuProduct(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Bánh gạo", "Ichi", 5000));
        productList.add(new Product(2, "Bánh gạo", "OneOne", 5000));

        ReadWriteFileUtils.writeDataFromFile("C0522G1_HoHaiHoc_Module2/src/ss17_binary_file_serialization/exercise/exercise1/data/data.dat",productList);

        Scanner scanner = new Scanner(System.in);
        IProductService iProductService = new ProductService();

        do {
            System.out.println("Hệ thống quản lý sản phẩm\n" +
                    "1. Thêm sản phẩm\n" +
                    "2. Hiển thị sản phẩm\n" +
                    "3. Tìm sản phẩm theo tên\n" +
                    "4. Tìm sản phẩm theo Id\n" +
                    "5. Thoát\n");
            int choice = 0;

            try {
                System.out.print("Nhập vào lựa chọn: ");
                choice = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e){
                System.out.print("Nhập chữ số.");
            }
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

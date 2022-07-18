package ss12_java_collection_framework.exercise.array_list.service.impl;

import police_manager_mvc.model.CarClass;
import ss12_java_collection_framework.exercise.array_list.model.Product;
import ss12_java_collection_framework.exercise.array_list.service.IProductManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService  implements IProductManager {

    private List<Product> productList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tên sản phẩm: ");
        String productName = scanner.nextLine();
        System.out.print("Nhập vào id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào ngày sản xuất");
        String dateOfManufacture = scanner.nextLine();
        System.out.print("Nhập vào nhà sản xuất");
        String producer = scanner.nextLine();
        productList.add(new Product( productName,  id,  dateOfManufacture,  producer));

    }

    @Override
    public void edit() {
        System.out.print("Nhập tên sản phẩm muốn thay đổi");
        String input = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++){
            if(input.equals(productList.get(i).getId())){
                System.out.print("Sửa tên:");
                String name = scanner.nextLine();

                System.out.print("Sửa giá:");
                double price = Double.parseDouble(scanner.nextLine());

                Product product = new Product(productList.get(i).getId(), name, price);
                productList.set(i, product);

                System.out.println("Chỉnh sửa thành công");
            }


        }
    }

    @Override
    public void remove() {
        System.out.print("Nhập vào sản phẩm cần xóa: ");
        String productNumRemove = scanner.nextLine();
        boolean isExit = false;

        for (Product product : productList) {
            if (productNumRemove.equals(product.getId())) {
                System.out.print("Bạn có chắc muốn xoá hay không: \n" +
                        "1. Có\n" +
                        "2. Không");
                int choose = Integer.parseInt(scanner.nextLine());

                if (choose == 1) {
                    productList.remove(product);
                    System.out.print("Đã xoá thành công!");
                }

                isExit = true;
                break;
            }
        }
        if (!isExit) {
            System.out.print("Không tìm thấy!");

        }

    }

    @Override
    public void displayList() {
        for (Product product : productList) {
            System.out.print(product);
        }
    }

    @Override
    public void findByName() {

    }

    @Override
    public void increasing() {

    }

    @Override
    public void decreasing() {

    }
}
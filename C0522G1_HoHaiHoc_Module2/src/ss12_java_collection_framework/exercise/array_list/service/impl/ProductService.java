package ss12_java_collection_framework.exercise.array_list.service.impl;

import police_manager_mvc.model.CarClass;
import ss12_java_collection_framework.exercise.array_list.model.Product;
import ss12_java_collection_framework.exercise.array_list.service.IProductManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductManager {

    private final static List<Product> productList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    static {
        productList.add(new Product(1, "cocacola", 6000.0));
        productList.add(new Product(2, "pepsi", 6000.0));
        productList.add(new Product(3, "cà phê", 7000.0));
        productList.add(new Product(4, "sữa", 10000.0));

    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào tên sản phẩm: ");
        String productName = scanner.nextLine();
        System.out.print("Nhập vào giá tiền: ");
        double price = Double.parseDouble(scanner.nextLine());
        productList.add(new Product(id, productName, price));
        System.out.println("Thêm mới thành công.");

    }

    @Override
    public void edit() {
        System.out.print("Nhập tên sản phẩm muốn thay đổi");
        String input = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (input.equals(productList.get(i).getId())) {
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
        String input = scanner.nextLine();

        for (Product product : productList) {
            if (input.equals(product.getId())) {
                System.out.print("Bạn có chắc muốn xoá hay không: \n" +
                        "1. Có\n" +
                        "2. Không");
                int choose = Integer.parseInt(scanner.nextLine());

                if (choose == 1) {
                    productList.remove(product);
                    System.out.print("Đã xoá thành công!");
                }

                return;
            }
        }

        System.out.println("Không tìm thấy!");


    }

    @Override
    public void displayList() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void findByName() {
        System.out.println("Nhập tên sảm phẩm cầm tìm");
        String name = scanner.nextLine();
        boolean isFlag = false;
        for (Product product : productList) {
            if (name.equals(product.getProductName())) {
                System.out.println(product);
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy!");
        }
    }

    @Override
    public void sort() {
        Scanner scanner = new Scanner(System.in);
        IncreasingPrice increasingPrice = new IncreasingPrice();
        DecreasingPrice decreasingPrice = new DecreasingPrice();
        do {
            System.out.println("Chọn cách sắp xếp: \n" +
                    "1.Sắp xếp tăng dần \n" +
                    "2.Sắp xếp giảm dần \n" +
                    "3.Quay trở lại menu ");
            System.out.println("Mời bạn lựa chọn: ");

            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    productList.sort(increasingPrice);
                case 2:
                    productList.sort(decreasingPrice);
                case 3:
                    return;
            }
        } while (true);

    }

    @Override
    public void increasing() {
        IncreasingPrice increasingPrice = new IncreasingPrice();
        productList.sort(increasingPrice);
    }

    @Override
    public void decreasing() {
        DecreasingPrice decreasingPrice = new DecreasingPrice();
        productList.sort(decreasingPrice);
    }
}
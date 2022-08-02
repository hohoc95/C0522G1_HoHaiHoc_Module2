package case_study.service.impl;

import case_study.model.Customer;
import case_study.service.ICustomerService;
import case_study.utils.ReadWriteCustomerFileUtils;
import case_study.utils.RegexExceptionUtil;
import case_study.utils.Utils;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH_CUSTOMER = "C0522G1_HoHaiHoc_Module2/src/case_study/data/customer.csv";
    private static List<Customer> customerList = new LinkedList<>();

    public void writeFile() {
        ReadWriteCustomerFileUtils.writeCustomerFile(PATH_CUSTOMER, customerList);
    }

    public void readFile() {
        List<Customer> list = ReadWriteCustomerFileUtils.readCustomerFile(PATH_CUSTOMER);
        customerList.clear();
        customerList.addAll(list);
    }

    @Override
    public void displayList() {
        readFile();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void add() {
        readFile();
        System.out.print("Nhập vào Id: ");
        boolean isExistId;
        String id;

        do {
            isExistId = false;
            id = scanner.nextLine();

            for (Customer customer : customerList) {
                if (customer.getId() == id) {
                    System.out.println("ID đã tồn tại, vui lòng nhập lại!");
                    isExistId = true;
                    break;
                }
            }

        } while (isExistId);

        String name = Utils.getName();

        String dateOfBirth = RegexExceptionUtil.getDateFormat();

        String email = RegexExceptionUtil.getEmail();

        String gender = Utils.getGender();

        System.out.println("Nhập vào số điện thoại: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Nhập vào mã khách hàng: ");
        String customerCode = scanner.nextLine();

        String kindOfCustomer = Utils.getKindOfCustomer();

        System.out.println("Nhập vào địa chỉ khách hàng: ");
        String addressCustomer = scanner.nextLine();

        customerList.add(new Customer(id, name, dateOfBirth, email, gender, phoneNumber, customerCode, kindOfCustomer, addressCustomer));
        writeFile();

        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void edit() {
        readFile();
        System.out.println("Nhập vào id khách hàng: ");
        String idEdit = scanner.nextLine();
        boolean isExistID = false;

        for (Customer customer : customerList) {
            if (idEdit.equals(customer.getId())) {
                System.out.println("Chỉnh sửa thông tin khách hàng: ");
                System.out.println(customer);
                System.out.println("Bạn có chắc là muốn chỉnh sửa?\n" +
                        "Nhấn 1 để chọn Có.\n" +
                        "Nhấn bất kỳ phím còn lại để chọn Không");
                String chooseYesNo = scanner.nextLine();

                if (chooseYesNo.equals("1")) {
                    System.out.println("Chỉnh sửa thông tin khách hàng");

                    System.out.print("Nhập vào tên: ");
                    customer.setName(Utils.getName());

                    System.out.print("Nhập vào ngày tháng năm sinh: ");
                    customer.setDateOfBirth(RegexExceptionUtil.getDateFormat());

                    System.out.println("Nhập vào giới tính: ");
                    customer.setGender(Utils.getGender());

                    System.out.println("Nhập vào email");
                    customer.setEmail(RegexExceptionUtil.getEmail());

                    System.out.println("Nhập vào số điện thoại");
                    customer.setPhoneNumber(RegexExceptionUtil.getPhoneNumber());

                    System.out.println("Nhập vào mã khách hàng");
                    customer.setCustomerCode(RegexExceptionUtil.getEmployyeCustumerCode());

                    System.out.println("Nhập vào loại khách hàng");
                    customer.setKindOfCustomer(Utils.getKindOfCustomer());

                    System.out.println("Nhập vào địa chỉ khách hàng");
                    customer.setAddressCustomer(RegexExceptionUtil.getUpperCase());

                    writeFile();
                    System.out.println("Chỉnh sửa thành công!");
                }
                isExistID = true;
                break;
            }
        }
        if (!isExistID) {
            System.out.println("Không tìm thấy.");
        }

    }
}

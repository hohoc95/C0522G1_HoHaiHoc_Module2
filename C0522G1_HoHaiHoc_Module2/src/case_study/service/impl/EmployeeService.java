package case_study.service.impl;

import case_study.utils.ReadWriteEmployeeFileUtils;
import case_study.model.Employee;
import case_study.service.IEmployeeService;
import case_study.utils.RegexExceptionUtil;
import case_study.utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH_EMPLOYEE = "C0522G1_HoHaiHoc_Module2/src/case_study/data/employee.csv";
    private static List<Employee> employeeList = new ArrayList<>();


    public void writeFile() {
        ReadWriteEmployeeFileUtils.writeEmployeeFile(PATH_EMPLOYEE, employeeList);
    }

    public void readFile() {
        List<Employee> list = ReadWriteEmployeeFileUtils.readEmployeeFile(PATH_EMPLOYEE);
        employeeList.clear();
        employeeList.addAll(list);
    }

    @Override
    public void displayList() {
        readFile();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void add() {
        readFile();
        System.out.print("Nhập vào Id: ");
        String id;
        boolean isExistID;
        do {
            isExistID = false;
            id = scanner.nextLine();

            for (Employee employee : employeeList) {
                if (id.equals(employee.getId())) {
                    System.out.println("ID đã tồn tại, vui lòng nhập lại!");
                    isExistID = true;
                    break;
                }
            }

        } while (isExistID);
        String name = Utils.getName().toString();

        String dateOfBirth = RegexExceptionUtil.getDateFormat();

        String email = RegexExceptionUtil.getEmail();

        String gender = Utils.getGender();

        System.out.println("Nhập vào số điện thoại: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Nhập vào mã nhân viên: ");
        String employeeCode = scanner.nextLine();

        String level = Utils.getLevel();

        String poisition = Utils.getPoisition();

        int salary;
        while (true) {
            try {
                System.out.println("nhập vào lương: ");
                salary = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số!");
            }
        }

        employeeList.add(new Employee(id, name, dateOfBirth, email, gender, phoneNumber, employeeCode, level, poisition, salary));
        System.out.println("Thêm mới thành công!");

        writeFile();
    }

    @Override
    public void edit() {
        readFile();
        System.out.println("Nhập vào Id nhân viên: ");
        String idEdit = scanner.nextLine();
        boolean isExistID = false;

        for (Employee employee : employeeList) {
            if (idEdit.equals(employee.getId())) {
                System.out.println("Chỉnh sửa nhân viên: ");
                System.out.println(employee);
                System.out.println("Bạn có chắc là sẽ chỉnh sửa?\n" +
                        "Nhấn 1 để chọn Có.\n" +
                        "Nhấn phím bất kỳ để chọn Không");
                String chooseYesNo = scanner.nextLine();

                if (chooseYesNo.equals("1")) {
                    System.out.println("Chỉnh sửa thông tin Nhân sự");

                    System.out.print("Nhập vào tên: ");
                    employee.setName(Utils.getName());

                    System.out.print("Nhập vào ngày tháng năm sinh: ");
                    employee.setDateOfBirth(RegexExceptionUtil.getDateFormat());

                    System.out.println("Nhập vào giới tính: ");
                    employee.setGender(Utils.getGender());

                    System.out.println("Nhập vào email");
                    employee.setEmail(RegexExceptionUtil.getEmail());

                    System.out.println("Nhập vào số điện thoại");
                    employee.setPhoneNumber(RegexExceptionUtil.getPhoneNumber());

                    System.out.println("Nhập vào mã nhân viên");
                    employee.setEmployeeCode(RegexExceptionUtil.getEmployyeCustumerCode());

                    System.out.println("Nhập vào cấp bậc");
                    employee.setLevel(Utils.getLevel());

                    System.out.println("Nhập vào vị trí");
                    employee.setPoisition(Utils.getPoisition());

                    System.out.println("Nhập vào lương");
                    employee.setSalary(RegexExceptionUtil.getNumberGreaterThan0());

                    writeFile();
                    System.out.println("Chỉnh sửa thành công!");
                }
                isExistID = true;
                break;
            }
        }
        if (!isExistID) {
            System.out.println("Không tìm thấy");
        }
    }
}

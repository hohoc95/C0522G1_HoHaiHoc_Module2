package exercise_mvc.service.impl;

import exercise_mvc.model.Student;
import exercise_mvc.service.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công.");
    }

    @Override
    public void displayAllStudent() {
        for(Student student: studentList){
            System.out.println(student);
        }
    }

    @Override
    public void removeStudent() {
        System.out.println("Nhập id cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;

        for (Student student: studentList){
            if(student.getId() == idRemove){
                System.out.println("Bạn có chắc là muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if(chooseYesNo == 1){
                    studentList.remove(student);
                    System.out.println("Xóa thành công.");
                }
                isFlag = true;
                break;
            }
        }
        if(!isFlag){
            System.out.println("Không tìm thấy.");
        }
    }

    public static Student infoStudent() {
        System.out.print("Nhập mã số: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Nhập giới tính: ");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Nhập tên lớp: ");
        String nameClass = scanner.nextLine();

        System.out.print("Nhập điểm: ");
        int point = Integer.parseInt(scanner.nextLine());

        Student student = new Student(id, name, dateOfBirth, gender, nameClass, point);
        return student;
    }

}

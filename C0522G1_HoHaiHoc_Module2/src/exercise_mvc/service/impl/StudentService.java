package exercise_mvc.service.impl;

import exercise_mvc.model.Student;
import exercise_mvc.service.IStudentService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        studentList.add(new Student(1,"Người Đi Trước","01/01/2000", "Nữ", "12", 8.0));
        studentList.add(new Student(2,"Kẻ Theo Sau","01/01/1995", "Nam", "12", 7.5));
    }

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

    @Override
    public void findById() {
        System.out.print("Nhập vào Id cần tìm: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < studentList.size(); i++) {
            if (id == studentList.get(i).getId()){
                System.out.println(studentList.get(i).toString());
            }
        }
    }

    @Override
    public void findByName() {
        System.out.println("Nhập vào tên cần tìm: ");
        String name = scanner.nextLine();
        boolean flag = false;
        for (Student student : studentList) {
            if (student.getName().contains(name)) {
                System.out.println(student);
                flag = true;
            }
        }
        if (!flag){
            System.err.println("không tìm thấy tên này!");
        }
    }

    @Override
    public void sortByName() {
        boolean isSwap = true;
        for (int i = 0; i < studentList.size() && isSwap; i++) {
            isSwap = false;

            for (int j = 0; j < studentList.size()-1-i; j++) {
                if (studentList.get(j).getName().compareTo(studentList.get(j+1).getName()) > 0){
                    Collections.swap(studentList,j,j+1);
                    isSwap = true;
                }
            }
        }
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i) + "\n");
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
        String gender = scanner.nextLine();

        System.out.print("Nhập tên lớp: ");
        String nameClass = scanner.nextLine();

        System.out.print("Nhập điểm: ");
        int point = Integer.parseInt(scanner.nextLine());

        Student student = new Student(id, name, dateOfBirth, gender, nameClass, point);
        return student;
    }

}

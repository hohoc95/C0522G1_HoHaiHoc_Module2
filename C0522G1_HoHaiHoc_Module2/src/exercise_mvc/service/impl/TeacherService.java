package exercise_mvc.service.impl;

import exercise_mvc.model.Student;
import exercise_mvc.model.Teacher;
import exercise_mvc.service.ITeacherService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static List<Teacher> teacherList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


    public void addTeacher() {
        Teacher teacher = infoTeacher();
        teacherList.add(teacher);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void displayAllTeacher() {
        for (Teacher teacher: teacherList){
            System.out.println(teacher);
        }
    }

    @Override
    public void removeTeacher() {
        System.out.println("Nhập id cần xóa");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;

        for (Teacher teacher: teacherList){
            if(teacher.getId() == idRemove){
                System.out.println("Bạn có chắc là muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if(chooseYesNo == 1){
                    teacherList.remove(teacher);
                    System.out.println("Xóa thành công");
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
        for (int i = 0; i < teacherList.size(); i++) {
            if (id == teacherList.get(i).getId()){
                System.out.println(teacherList.get(i).toString());
            }
        }
    }

    @Override
    public void findByName() {
        System.out.println("Nhập vào tên cần tìm: ");
        String name = scanner.nextLine();
        boolean flag = false;
        for (Teacher teacher : teacherList) {
            if (teacher.getName().contains(name)) {
                System.out.println(teacher);
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
        for (int i = 0; i < teacherList.size() && isSwap; i++) {
            isSwap = false;

            for (int j = 0; j < teacherList.size()-1-i; j++) {
                if (teacherList.get(j).getName().compareTo(teacherList.get(j+1).getName()) > 0){
                    Collections.swap(teacherList,j,j+1);
                    isSwap = true;
                }
            }
        }
        for (int i = 0; i < teacherList.size(); i++) {
            System.out.println(teacherList.get(i) + "\n");
        }
    }

    public static Teacher infoTeacher(){
        System.out.print("Nhập mã số: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Nhập giới tính: ");
        String gender = scanner.nextLine();

        System.out.print("Nhập chuyên môn: ");
        String specialize = scanner.nextLine();

        Teacher teacher = new Teacher(id, name, dateOfBirth, gender, specialize);
        return teacher;
    }
}

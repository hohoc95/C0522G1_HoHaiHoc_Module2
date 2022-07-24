package exercise_mvc.service.impl;

import exercise_mvc.model.Student;
import exercise_mvc.service.IStudentService;
import exercise_mvc.utils.DuplicateIDException;
import exercise_mvc.utils.ReadFile;
import exercise_mvc.utils.WriteFile;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH =  "src/exercise_mvc/data/student.csv";

    public void writeFile(){
        WriteFile.writeStudentFile(PATH, studentList);
    }

    public void readFile(){
        List<Student> list = ReadFile.readStudentFile(PATH);
        studentList.clear();
        studentList.addAll(list);
    }

    public void addStudent() {
        readFile();
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công.");
        writeFile();
    }

    @Override
    public void displayAllStudent() {
        readFile();
        for(Student student: studentList){
            System.out.println(student);
        }
    }

    @Override
    public void removeStudent() {
        readFile();
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
                    writeFile();
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
        readFile();
        System.out.print("Nhập vào Id cần tìm: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean isExitst = false;

        for (int i = 0; i < studentList.size(); i++) {
            if (id == studentList.get(i).getId()){
                System.out.println(studentList.get(i).toString());
                isExitst = true;
                break;
            }
        }
        if(!isExitst){
            System.out.println("Id không tồn tại.");
        }
    }

    @Override
    public void findByName() {
        readFile();
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
        readFile();
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
        System.out.println("Danh sách đã sắp xếp: ");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i) + "\n");
        }
        writeFile();
    }

    public static Student infoStudent() {
        //System.out.print("Nhập mã số: ");
        int id ;
        while (true){
            try {
                System.out.println("Nhập vào id: ");
                id = Integer.parseInt(scanner.nextLine());

                for (Student student: studentList){
                    if (student.getId() == id){
                        throw new DuplicateIDException("Id đã tồn tại, nhập lại");
                    }
                }
                break;
            }
            catch (NumberFormatException e){
                System.out.println("Hãy nhập chữ số");
            }
            catch (DuplicateIDException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Nhập giới tính: ");
        String gender = scanner.nextLine();

        System.out.print("Nhập tên lớp: ");
        String nameClass = scanner.nextLine();

        double point;
        while (true){
            try {
                System.out.println("Nhập điểm: ");
                point = Double.parseDouble(scanner.nextLine());
                break;
            }
            catch (NumberFormatException e){
                System.out.println("Nhập kiểu số.");
            }
        }

        return  new  Student(id, name, dateOfBirth, gender, nameClass, point);
    }

}

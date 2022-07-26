package exercise_mvc.controller;

import java.util.Scanner;

public class MainController {
    public static void menuController(){
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("-CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN- \n" +
                    "Chọn chức năng theo số(để tiếp tục).\n" +
                    "1. Quản lý giảng viên .\n" +
                    "2. Quản lý học sinh.\n" +
                    "3. Thoát.\n" +
                    "Chọn chức năng:");
            System.out.print("Nhập lựa chọn: ");
            int choose = 0;
            try {
                System.out.print("Mời bạn nhập lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }
            switch (choose){
                case 1:{
                    teacherController.menuTeacher();
                    break;
                }
                case 2:{
                    studentController.menuStudent();
                    break;
                }
                case 3:{
                    System.exit(1);
                }
                default:
                    System.out.println("Nhập lại lựa chọn");
            }

        }while (true);
    }
}

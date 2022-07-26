package exercise_mvc.controller;

import exercise_mvc.service.IStudentService;
import exercise_mvc.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    public void menuStudent() {
        Scanner scanner = new Scanner(System.in);
        IStudentService iStudentService = new StudentService();
        do {
            System.out.println("1. Thêm mới học sinh \n" +
                    "2. Xóa học sinh \n" +
                    "3. Xem danh sách học sinh \n" +
                    "4. Tìm học sinh theo ID \n" +
                    "5. Tìm học sinh theo tên \n" +
                    "6. Sắp xếp danh sách \n" +
                    "7. Quay về menu chính.");
            int choose = 0;
            try {
                System.out.print("Nhập vào lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e) {
                System.out.println("Hãy nhập chữ số.");
            }
            switch (choose){
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    iStudentService.removeStudent();
                    break;
                case 3:
                    iStudentService.displayAllStudent();
                    break;
                case 4:
                    iStudentService.findById();
                    break;
                case 5:
                    iStudentService.findByName();
                    break;
                case 6:
                    iStudentService.sortByName();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Nhập lại lựa chọn");
            }
        }while (true);
    }
}

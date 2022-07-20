package exercise_mvc.controller;

import exercise_mvc.service.ITeacherService;
import exercise_mvc.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private Scanner scanner = new Scanner(System.in);
    private ITeacherService iTeacherService = new TeacherService();

    public void menuTeacher(){
        do {
            System.out.println("1. Thêm mới giảng viên \n" +
                    "2. Xóa giảng viên \n" +
                    "3. Xem danh sách giảng viên \n" +
                    "4. Tìm giáo viên theo id \n" +
                    "5. Tìm giáo viên theo tên \n" +
                    "6. Sắp xếp danh sách \n" +
                    "7. Quay về menu chính.");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    iTeacherService.addTeacher();
                    break;
                case 2:
                    iTeacherService.removeTeacher();
                    break;
                case 3:
                    iTeacherService.displayAllTeacher();
                    break;
                case 4:
                    iTeacherService.findById();
                    break;
                case 5:
                    iTeacherService.findByName();
                    break;
                case 6:
                    iTeacherService.sortByName();
                    break;
                case 7:
                    return;
            }
        }while (true);
    }
}

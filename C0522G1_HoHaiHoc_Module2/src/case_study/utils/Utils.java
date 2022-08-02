package case_study.utils;

import case_study.exception.EmailFormatException;

import java.util.Scanner;

public class Utils {
    private static Scanner scanner = new Scanner(System.in);

    public static String getGender() {
        System.out.println("Nhập vào giới tính:\n" +
                "1. Nam\n" +
                "2. Nữ\n" +
                "3. LGBT");

        do {
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("vui lòng nhập số");
                }
            }
            switch (choice) {
                case 1:
                    return "Nam";
                case 2:
                    return "Nữ";
                case 3:
                    return "LGBT.";
                default:
                    System.err.println("Lựa chọn vừa nhập không có, hãy nhập lại!");
            }
        } while (true);
    }

    public static String getName(){
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        String[] array = name.toLowerCase().trim().split("");
        StringBuilder stringBuilder = new StringBuilder().append(array[0].toUpperCase());
        for (int i = 1; i < array.length; i++) {
            if (!array[i].equals(" ")){
                if (array[i-1].equals(" ")){
                    stringBuilder.append(array[i].toUpperCase());
                } else {
                    stringBuilder.append(array[i]);
                }
            } else if (!array[i+1].equals(" ")){
                stringBuilder.append(array[i]);
            }
        }
        return stringBuilder.toString();
    }

    public static String getPoisition() {
        System.out.println("Nhập vào chức vụ:\n" +
                "1. Receptionist\n" +
                "2. Waiter\n" +
                "3. Specialist" +
                "4. Supervisor\n" +
                "5. Manager\n" +
                "6. Director");

        do {
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("vui lòng nhập số");
                }
            }
            switch (choice) {
                case 1:
                    return "Receptionist";
                case 2:
                    return "Waiter";
                case 3:
                    return "Specialist";
                case 4:
                    return "Supervisor";
                case 5:
                    return "Manager";
                case 6:
                    return "Director";
                default:
                    System.err.println("Lựa chọn không đúng, vui lòng chọn lại!");
            }
        } while (true);
    }

    public static String getLevel() {
        System.out.println("Nhập vào cấp bậc:\n" +
                "1. Intermediate\n" +
                "2. College\n" +
                "3. University\n"+
                "4. After university.");

        do {
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("vui lòng nhập số");
                }
            }
            switch (choice) {
                case 1:
                    return "Intermediate.";
                case 2:
                    return "College.";
                case 3:
                    return "University.";
                case 4:
                    return "After university.";
                default:
                    System.err.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
            }
        } while (true);
    }

    public static String getKindOfCustomer() {
        System.out.println("Nhập vào loại khách hàng:\n" +
                "1. Diamond\n" +
                "2. Platinium\n" +
                "3. Gold\n"+
                "4. Silver\n"+
                "5. Member.");

        do {
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("vui lòng nhập số");
                }
            }
            switch (choice) {
                case 1:
                    return "Diamond.";
                case 2:
                    return "Platinium.";
                case 3:
                    return "Gold.";
                case 4:
                    return "Silver.";
                case 5:
                    return "Member.";
                default:
                    System.err.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
            }
        } while (true);
    }
    public static String getLeaseType() {
        System.out.println("Nhập vào kiểu thuê:\n" +
                "1. Thuê theo năm.\n" +
                "2. Thuê theo tháng.\n" +
                "3. Thuê theo ngày.\n" +
                "4. Thuê theo giờ.");
        int choose = 0;
        do {
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                e.getStackTrace();
            }
            switch (choose) {
                case 1:
                    return "Năm";
                case 2:
                    return "Tháng";
                case 3:
                    return "Ngày";
                case 4:
                    return "Giờ";
                default:
                    System.out.println("Lựa chọn của bạn không tồn tại, vui lòng nhập lại!");
            }
        } while (true);
    }


}

package case_study.utils;

import case_study.exception.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class RegexExceptionUtil {
    private static final Scanner scanner = new Scanner(System.in);

    private static boolean isLeapYear(int year){
        boolean isDivisible4 = year % 4 == 0;
        boolean isDivisible100 = year % 100 == 0;
        boolean isDivisible400 = year % 400 == 0;

        return (isDivisible4 && isDivisible100) || isDivisible400;
    }

    public static String getDateFormat(){
        String dateOfBirth;
        while (true){
            try {
                System.out.println("Nhập vào ngày tháng năm sinh: ");
                dateOfBirth = scanner.nextLine();
                if (!dateOfBirth.matches("(0[1-9]|[12]\\d|3[0-1])/(0[1-9]|1[0-2])/(19\\d{2}|20(0\\d|1\\d))")){
                    throw new DateInvalidException("Please enter the correct format\n dd/mm/yyyy!");
                }

                String[] strings = dateOfBirth.split("/");
                if (strings[1].equals("04") || strings[1].equals("06") || strings[1].equals("09") || strings[1].equals("11")){
                    if (Integer.parseInt(strings[0]) > 30){
                        throw new DateInvalidException("Please enter the correct number of days in the month (this month has a maximum of 30 days)!");
                    }
                } else if (strings[1].equals("02")){
                    if (isLeapYear(Integer.parseInt(strings[2]))){
                        if (Integer.parseInt(strings[0]) > 29){
                            throw new DateInvalidException("Please enter the correct number of days in the month (February has a maximum of 29 days because it is a leap year)!");
                        }
                    } else {
                        if (Integer.parseInt(strings[0])>28){
                            throw new DateInvalidException("Please enter the correct number of days in the month (February has a maximum of 28 days)!");
                        }
                    }
                }

                return dateOfBirth;
            } catch (DateInvalidException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static String getAge() {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        double age;
        String dateOfBirth;

        while (true) {
            try {
                dateOfBirth = getDateFormat();
                age = (double) (date.getTime() - dateFormat.parse(dateOfBirth).getTime())/315576E5;
                if (age < 18 || age > 100) {
                    throw new DateInvalidException("Ngày sinh phải nhỏ hơn ngày hiện tại 18 năm và người dùng " +
                            "không được quá 100 tuổi!");
                }
                return dateOfBirth;

            } catch (DateInvalidException e) {
                System.out.println(e.getMessage());
            } catch (ParseException e) {
                e.getStackTrace();
            }
        }
    }
    public static String getPhoneNumber() {
        String phoneNumber;
        while (true) {
            try {
                phoneNumber = scanner.nextLine();
                if (!phoneNumber.matches("^0\\d{9}$")) {
                    throw new NumberRegexInvalidException("Số điện thoại phải bao gồm 10 chữ số " +
                            "và bắt đầu bằng số 0, vui lòng nhập lại!");
                }
                break;
            } catch (NumberRegexInvalidException e) {
                System.out.println(e.getMessage());
            }
        }

        return phoneNumber;
    }

    public static String getEmail(){
        String email;
        while (true){
            try{
                System.out.println("Nhập vào email: ");
                email = scanner.nextLine();
                if(!email.matches("^([.A-Za-z0-9]+){1,2}+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+){1,2}$")){
                    throw new EmailFormatException("Vui lòng nhập đúng email.");
                }
                return email;
            }
            catch (EmailFormatException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static int getNumberGreaterThan0() {
        int number;
        while (true) {
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number <= 0) {
                    throw new NumberValueInvalidException("Giá trị nhập vào phải lớn hơn 0, vui lòng nhập lại!");
                }

                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            } catch (NumberValueInvalidException e) {
                System.out.println(e.getMessage());
            }
        }
        return number;
    }

    public static String getUpperCase() {
        String name;
        while (true) {
            try {
                name = scanner.nextLine();
                if (!name.matches("^[A-Z][a-z]+( [A-Z][a-z]+)+$")) {
                    throw new TextFormatException("Phải viết hoa những chữ cái đầu, vui lòng nhập lại!");
                }

                break;
            } catch (TextFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        return name;
    }

    public static String getEmployyeCustumerCode() {
        String idCard;
        while (true) {
            try {
                idCard = scanner.nextLine();
                if (!idCard.matches("^\\d{9}$")) {
                    throw new NumberRegexInvalidException("Số CMND phải bao gồm 9 chữ số từ 0-9, vui lòng nhập lại!");
                }

                break;
            } catch (NumberRegexInvalidException e) {
                System.out.println(e.getMessage());
            }
        }

        return idCard;
    }

    public static double getAreaUse() {
        double areaUse;
        while (true) {
            try {
                areaUse = Double.parseDouble(scanner.nextLine());
                if (areaUse <= 30) {
                    throw new AreaInvalidException("Diện tích sử dụng phải là số thực lớn hơn 30m2!");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            } catch (AreaInvalidException e) {
                System.out.println(e.getMessage());
            }
        }
        return areaUse;
    }
    public static int getMaxNumberOfPeople() {
        int maxNumberOfPeople;
        while (true) {
            try {
                maxNumberOfPeople = Integer.parseInt(scanner.nextLine());
                if (maxNumberOfPeople <= 0 || maxNumberOfPeople >= 20) {
                    throw new MaxNumberOfPeopleInvalidException("Số lượng người tối đa phải lớn hơn 0 và nhỏ hơn 20!");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            } catch (MaxNumberOfPeopleInvalidException e) {
                System.out.println(e.getMessage());
            }
        }
        return maxNumberOfPeople;
    }
    public static String getRoomStandard() {
        String roomStandard;
        while (true) {
            try {
                roomStandard = scanner.nextLine();
                if (!roomStandard.matches("^[A-Z][a-z]+( [a-z]+)*$")) {
                    throw new TextFormatException("Tiêu chuẩn phòng phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường!");
                }

                break;
            } catch (TextFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        return roomStandard;
    }
}

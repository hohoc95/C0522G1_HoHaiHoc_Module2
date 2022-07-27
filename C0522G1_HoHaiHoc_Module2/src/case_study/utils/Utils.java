package case_study.utils;

import case_study.exception.DateException;
import case_study.exception.EmailFormatException;

import java.util.Scanner;

public class Utils {
    private static Scanner scanner = new Scanner(System.in);

    public static String getGender() {
        System.out.println("Enter gender:\n" +
                "1. Male\n" +
                "2. Female\n" +
                "3. LGBT");

        do {
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("pls, enter number");
                }
            }
            switch (choice) {
                case 1:
                    return "Male";
                case 2:
                    return "Female";
                case 3:
                    return "LGBT.";
                default:
                    System.err.println("Without this selection, re-enter the selection!");
            }
        } while (true);
    }

    public static String getName(){
        System.out.println("Enter name:");
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
        return array.toString();
    }

    private static boolean isLeapYear(int year){
        boolean isDivisible4 = year % 4 == 0;
        boolean isDivisible100 = year % 100 == 0;
        boolean isDivisible400 = year % 400 == 0;

        return (isDivisible4 && isDivisible100) || isDivisible400;
    }

    public static String getDateOfBirth(){
        String dateOfBirth;
        while (true){
            try {
                System.out.println("Enter day of birth: ");
                dateOfBirth = scanner.nextLine();
                if (!dateOfBirth.matches("(0[1-9]|[12]\\d|3[0-1])/(0[1-9]|1[0-2])/(19\\d{2}|20(0\\d|1\\d))")){
                    throw new DateException("Please enter the correct format\n dd/mm/yyyy!");
                }

                String[] strings = dateOfBirth.split("/");
                if (strings[1].equals("04") || strings[1].equals("06") || strings[1].equals("09") || strings[1].equals("11")){
                    if (Integer.parseInt(strings[0]) > 30){
                        throw new DateException("Please enter the correct number of days in the month (this month has a maximum of 30 days)!");
                    }
                } else if (strings[1].equals("02")){
                    if (isLeapYear(Integer.parseInt(strings[2]))){
                        if (Integer.parseInt(strings[0]) > 29){
                            throw new DateException("Please enter the correct number of days in the month (February has a maximum of 29 days because it is a leap year)!");
                        }
                    } else {
                        if (Integer.parseInt(strings[0])>28){
                            throw new DateException("Please enter the correct number of days in the month (February has a maximum of 28 days)!");
                        }
                    }
                }

                return dateOfBirth;
            } catch (DateException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static String getEmail(){
        String email;
        while (true){
            try{
                System.out.println("Enter your email: ");
                email = scanner.nextLine();
                if(!email.matches("^([.A-Za-z0-9]+){1,2}+@[A-Za-z0-9]+(\\\\.[A-Za-z0-9]+){1,2}$")){
                    throw new EmailFormatException("Please enter the correct email");
                }
                return email;
            }
            catch (EmailFormatException e){
                System.out.println(e.getMessage());
            }
        }
    }

}

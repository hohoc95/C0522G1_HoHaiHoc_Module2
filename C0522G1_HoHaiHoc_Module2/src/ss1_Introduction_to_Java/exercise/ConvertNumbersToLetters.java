package ss1_Introduction_to_Java.exercise;

import java.util.Scanner;

public class ConvertNumbersToLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Nhập vào một số: ");
        number = scanner.nextInt();

        if (number < 10 && number >= 0) {
            switch (number) {
                case 0:
                    System.out.print("zero");
                    break;
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
            }
        }
        else if (number < 20){
            switch (number % 10) {
                case 0:
                    System.out.print("ten");
                    break;
                case 1:
                    System.out.print("eleven");
                    break;
                case 2:
                    System.out.print("twelve");
                    break;
                case 3:
                    System.out.print("thirteen");
                    break;
                case 4:
                    System.out.print("fourteen");
                    break;
                case 5:
                    System.out.print("fifteen");
                    break;
                case 6:
                    System.out.print("sixteen");
                    break;
                case 7:
                    System.out.print("seventeen");
                    break;
                case 8:
                    System.out.print("eightteen");
                    break;
                case 9:
                    System.out.print("nineteen");
                    break;
            }
        }
        else if (number < 99){
            // Hàng chục
            switch (number / 10) {
//                case 0:
//                    System.out.print("ten");
//                    break;
//                case 1:
//                    System.out.print("eleven");
//                    break;
                case 2:
                    System.out.print("twelve");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("fourty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eightty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
            }
            // Hàng đơn vị
            switch (number % 10) {
//                case 0:
//                    System.out.print("zero");
//                    break;
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
            }
        }
        else if (number < 1000 ){
            switch (number / 100) {
//                case 0:
//                    System.out.print("ten");
//                    break;
                case 1:
                    System.out.print("one hundred");
                    break;
                case 2:
                    System.out.print("two hundred ");
                    break;
                case 3:
                    System.out.print("three hundred ");
                    break;
                case 4:
                    System.out.print("four hundred ");
                    break;
                case 5:
                    System.out.print("five hundred ");
                    break;
                case 6:
                    System.out.print("six hundred ");
                    break;
                case 7:
                    System.out.print("seven hundred ");
                    break;
                case 8:
                    System.out.print("eight hundred ");
                    break;
                case 9:
                    System.out.print("nine hundred ");
                    break;
            }
            switch (number % 10){
                case 2:
                    System.out.print(" twelve ");
                    break;
                case 3:
                    System.out.print(" thirty ");
                    break;
                case 4:
                    System.out.print(" fourty ");
                    break;
                case 5:
                    System.out.print(" fifty ");
                    break;
                case 6:
                    System.out.print(" sixty ");
                    break;
                case 7:
                    System.out.print(" seventy ");
                    break;
                case 8:
                    System.out.print(" eightty ");
                    break;
                case 9:
                    System.out.print(" ninety ");
                    break;
            }
            switch (number % 10){
                case 1:
                    System.out.print(" one ");
                    break;
                case 2:
                    System.out.print(" two ");
                    break;
                case 3:
                    System.out.print(" three ");
                    break;
                case 4:
                    System.out.print(" four ");
                    break;
                case 5:
                    System.out.print(" five ");
                    break;
                case 6:
                    System.out.print(" six ");
                    break;
                case 7:
                    System.out.print(" seven ");
                    break;
                case 8:
                    System.out.print(" eight ");
                    break;
                case 9:
                    System.out.print(" nine ");
                    break;
            }
        }
    }
}


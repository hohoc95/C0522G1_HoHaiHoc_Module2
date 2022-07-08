package ss1_introduction_to_Java.practice;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // bmi = weight / height * height

         double weight, bmi, height;
        System.out.print("Nhập vào cân nặng ");
        weight = scanner.nextDouble();

        System.out.print("Nhập vào chiều cao ");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s","bmi","Interpretation\n");

        if(bmi < 18){
            System.out.println();
        }
        else if(bmi < 25.0){
            System.out.println();
        }
        else if(bmi < 30.0){
            System.out.println();
        }
        else{
            System.out.println();
        }
    }
}

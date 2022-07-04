package ss2_Loop_in_Java.practice;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập vào số tiền gửi: ");
        money = input.nextDouble();

        System.out.print("Nhập vào số tháng gửi: ");
        month = input.nextInt();

        System.out.print("Nhập vào lãi suất: ");
        interestRate = input.nextDouble();

        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }

        System.out.print("Tổng số tiền lãi: " + totalInterest);

    }
}

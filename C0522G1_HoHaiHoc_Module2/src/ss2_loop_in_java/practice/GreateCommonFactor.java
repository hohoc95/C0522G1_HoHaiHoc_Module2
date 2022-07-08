package ss2_loop_in_java.practice;

import java.util.Scanner;

public class GreateCommonFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        a = input.nextInt();
        System.out.print("Nhập số b: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.print("Không có ước chung");
        }
        else {
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            System.out.print("Ước chung là : " + a);
        }
    }
}

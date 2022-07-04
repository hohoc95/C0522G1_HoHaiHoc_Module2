package ss3_ArraysAndMethodsInJava.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPooling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Độ dài 3 mảng
        int length1 =0, length2 = 0;
        int length3 = length1 + length2;

        // Khai báo mảng 3
        length3= length1 + length2;
        int[] array3 = new int[length3];

        // Khai báo mảng 1
        System.out.print("Nhập số phần tử của mảng 1 ");
         length1 = scanner.nextInt();
        int[] array1 = new int[length1];

        for (int i = 0;i < length1; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
//            for (int j = 0; j < length3; j++){
//                array3[j] = array1[i];
//            }
        }
        System.out.print("Mảng vừa tạo");
        System.out.print(Arrays.toString(array1));

        // Khai báo mảng 2
        System.out.println("Nhập số phần tử của mảng 2 ");
        length2 = scanner.nextInt();
        int[] array2 = new int[length2];

        for (int i = 0;i < length2; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
//            for (int j = length1; j < length3; j++){
//                array3[j] = array2[i];
//            }
        }
        System.out.print("Mảng vừa tạo");
        System.out.print(Arrays.toString(array2));




        System.out.println("Mảng gộp của 2 mảng là");
        System.out.print(Arrays.toString(array3));

    }
}

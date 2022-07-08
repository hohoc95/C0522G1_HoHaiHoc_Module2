package ss3_arrays_and_methods_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConnectorArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài mảng thứ 1: ");

        int firstLength = scanner.nextInt();
        int[] arrayFirst = new int[firstLength];

        for (int i = 0; i < arrayFirst.length; i++) {
            System.out.printf("Nhập vào phần tử a[%d] ", i);
            arrayFirst[i] = scanner.nextInt();
        }

        System.out.print("Mảng thứ nhất: ");
        System.out.print(Arrays.toString(arrayFirst));

        System.out.print("Nhập vào độ dài mảng thứ 2: ");
        int secondLength = scanner.nextInt();
        int[] arraySecond = new int[secondLength];

        for (int i = 0; i < arraySecond.length; i++) {
            System.out.printf("Nhập phần tử a[%d] ", i);
            arraySecond[i] = scanner.nextInt();
        }

        System.out.print("Mảng thứ 2: ");
        System.out.print(Arrays.toString(arraySecond));

        int[] arrayThird = new int[firstLength + secondLength];
        for (int i = 0; i < arrayFirst.length; i++){
            arrayThird[i] = arrayFirst[i];
        }
        for (int j = 0; j < arraySecond.length; j++){
            arrayThird[arrayFirst.length + j] = arraySecond[j];
        }
        System.out.println("\nMảng gộp: ");
        System.out.println(Arrays.toString(arrayThird));
    }
}

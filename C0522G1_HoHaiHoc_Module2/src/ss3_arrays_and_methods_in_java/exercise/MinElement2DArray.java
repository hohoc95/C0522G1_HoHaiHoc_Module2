package ss3_arrays_and_methods_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MinElement2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài mảng: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Nhập phần tử a[%d]", i);
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng vừa nhập: ");
        System.out.println(Arrays.toString(array));

        int min = array[0];

        for (int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Số nhỏ nhất trong mảng là: " + min);
    }
}

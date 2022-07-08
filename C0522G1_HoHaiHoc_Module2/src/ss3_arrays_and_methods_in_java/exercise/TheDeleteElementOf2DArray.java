package ss3_arrays_and_methods_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TheDeleteElementOf2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo mảng

        System.out.print("Nhập độ dài của mảng: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Nhập phàn tử a[%d]", i);
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng vừa nhập: ");
        System.out.println(Arrays.toString(array));

        System.out.print("Nhập số bạn muốn xóa: ");
        int number = scanner.nextInt();

        // Kiểm tra phần tử x có tồn tại trong mảng
        boolean IsExit = false;

        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                IsExit = true;
                for (int j = i; j < array.length - 1; j++) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                array[array.length -1] = 0;
            }
        }
        if(IsExit){
            System.out.println("Mảng sau khi xóa: ");
            System.out.println(Arrays.toString(array));
        }else {
            System.out.println("Không có phần tử cần xóa trong mảng. ");
        }
    }
}
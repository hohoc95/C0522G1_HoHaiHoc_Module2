package ss3_ArraysAndMethodsInJava.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementsFromArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo mảng
        System.out.print("Nhập số phần tử của mảng");
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0;i < length; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Mảng vừa tạo");
        System.out.print(Arrays.toString(array));


        System.out.print("Nhập phần tử cần xóa");
        int x = scanner.nextInt();

        // Kiểm tra phần tử x có tồn tại trong mảng

        boolean isExist = true;
        for (int i = 0; i < length; i++){
            if(x == array[i]){
                isExist = false;
                for (int j = i; j < array.length - 1; j++) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                array[array.length - 1] = 0;
            }
            else {
                isExist = true;
            }
        }
        if (isExist){
            System.out.print("Mảng sau khí xóa là:");
            System.out.println(Arrays.toString(array));
        }
        else {
            System.out.print("Không có phần tử cần xóa trong mảng.");
        }

    }
}

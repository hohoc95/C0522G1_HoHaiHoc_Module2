package ss3_arrays_and_methods_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TheAddElementToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo mảng
        System.out.print("Nhập vào độ dài của mảng: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Nhập vào phần tử a[%d] ", i);
            array[i] = scanner.nextInt();
        }
        System.out.print("Mảng vừa nhập: ");
        System.out.println(Arrays.toString(array));
        int[] newArray = new int[length + 1];

        System.out.print("Nhập vào số mà bạn muốn thêm vào mảng: ");
        int number = scanner.nextInt();
        System.out.print("Vị trí muốn thêm của số vừa nhập: ");
        int index = scanner.nextInt();
        if (index < -1 || index > array.length) {
            System.out.print("Vị trí không phù hợp. ");
        }
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }

        newArray[index] = number;

        for (int j = index + 1; j < newArray.length; j++) {
            newArray[j] = array[j - 1];
        }

        array = newArray;
        System.out.println("Mảng sau khi chèn: ");
        System.out.println(Arrays.toString(array));

    }
}

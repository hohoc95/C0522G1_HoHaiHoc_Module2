package ss3_arrays_and_methods_in_java.practice;

import java.util.Scanner;

public class ReverseElementsOfTheArray {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int size;
//        do {
//            System.out.print("Nhập vào độ dài mảng");
//            size = scanner.nextInt();
//            if(size > 20){
//                System.out.println("Độ dài mảng quá lớn");
//            }
//        }while (size > 20);

        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

    }
}

package ss3_ArraysAndMethodsInJava.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo mảng
        System.out.print("Nhập số phần tử của mảng");
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0;i < length -1; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Mảng vừa tạo");
        System.out.print(Arrays.toString(array));

        //Nhập x cần chèn và vị trí của x
        int xIndex = 0;
        System.out.print("Nhập sô cần chèn");
        int x = scanner.nextInt();
        do {
            System.out.print("Nhập vị trí của số đó");
            xIndex = scanner.nextInt();

            if(xIndex < -1 || xIndex >= length -1){
                System.out.print("Không chèn được phần tử vào mảng, hãy nhập lại ");
            }

        }while (xIndex < -1 || xIndex >= length -1);

        //Chèn x vào mảng
        for( int i = 0; i < length; i++){
            if(xIndex == i){
                array[i-1] = x;
                for (int j = i; j < array.length - 1; j++) {
                    int temp = array[j -1];
                    array[j -1] = array[j];
                    array[j ] = temp;
                }
            }
        }
        System.out.print("Mảng sau khi chèn số là:");
        System.out.print(Arrays.toString(array));

    }
}

package ss14_sort_algorithm.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortIllustration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng: ");
        int lengthArr = Integer.parseInt(scanner.nextLine());

        int [] arr = new int[lengthArr ];

        for (int i = 0; i < lengthArr ; i++){
            System.out.printf("Nhập phần tử mảng %d của mảng: ",i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println(Arrays.toString(arr));

        inserSort(arr);

        System.out.print("Mảng sau khi sắp xếp là: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    public static void inserSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j;

            for (j = i - 1; j >= 0 && arr[j] > key; j--){
                System.out.println(arr[j] + " > " + key);
                System.out.println("hoán đổi vị trí " + arr[j + 1] + " cho " + arr[j]);
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }
//        System.out.print("Mảng sau khi sắp xếp là: ");
//        System.out.print(Arrays.toString(arr));
    }
}

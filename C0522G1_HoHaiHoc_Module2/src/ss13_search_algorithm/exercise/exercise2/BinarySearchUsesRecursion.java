package ss13_search_algorithm.exercise.exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchUsesRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng: ");
        int lengthArr = Integer.parseInt(scanner.nextLine());

        int [] arr = new int[lengthArr ];
        for (int i = 0; i < lengthArr ; i++){
            System.out.printf("Nhập phần tử mảng %d của mảng: ",i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        Arrays.sort(arr);
        System.out.print("Mảng sau khi sắp xếp là: ");
        System.out.print(Arrays.toString(arr));

        System.out.print("Nhập vào số cần tìm: ");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.print("Vị trí số cần tìm là: ");
        System.out.print(binarySearch(arr, 0, lengthArr -1, number));
    }

    public static int binarySearch(int [] arr, int left, int right, int number){
        if(right >= left){
            int mid = (left + right)/2;

            if (number == arr[mid]){
                return mid;
            }
            if (number > arr[mid]){
                return binarySearch(arr, mid + 1, right, number);
            }
            return binarySearch(arr, left, mid -1, number);

        }
        return -1;
    }
}

package ss15_exception_and_debug.practice;

import java.util.Random;
import java.util.Scanner;


public class ArrayExample {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer [] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui lòng nhập chỉ số của 1 phần tử bất kỳ: ");
        int input = Integer.parseInt(scanner.nextLine());

        try {
            System.out.print("Giá trị phần tử có chỉ số " + input + " là " + arr[input]);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.print("Chỉ số vượt quá giới hạn của mảng.");
        }
    }

    public Integer[] createRandom(){
        Random random = new Random();
        Integer[] arr = new Integer[100];
        System.out.print("Danh sách phần tử mảng: ");

        for (int i = 0; i < arr.length ; i ++){
            arr[i] = random.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }
}

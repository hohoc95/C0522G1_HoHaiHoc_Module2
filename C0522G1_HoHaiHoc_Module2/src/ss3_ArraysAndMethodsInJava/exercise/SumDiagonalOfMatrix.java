package ss3_ArraysAndMethodsInJava.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumDiagonalOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hàng: ");
        int row = scanner.nextInt();

        System.out.print("Nhập cột: ");
        int col = scanner.nextInt();

        int[][] matrix = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Nhập phần tử mảng [%d][%d] ", i, j);
                matrix[i][j] =scanner.nextInt();
            }
        }

        int max = matrix[0][0];
        System.out.println("Ma trận vừa nhập: ");

        // Dùng for để duyệt mảng 2 chiều
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(Arrays.toString(matrix[i]));
            System.out.println();
        }
        // Duyệt mảng bằng deepToString => ko xuống hàng
        //System.out.println(Arrays.deepToString(matrix));
        int sum1= 0;
        int sum2= 0;

        for (int i = 0; i < matrix.length; i++){
            sum1 += matrix[i][i];
        }
        for (int i = 0; i < matrix.length; i++){
            sum2+= matrix[i][matrix.length - 1 - i];
        }

        System.out.println("Đường chéo 1 có độ dài là "+ sum1);
        System.out.println("Đường chéo 2 có độ dài là "+ sum2);
    }
}

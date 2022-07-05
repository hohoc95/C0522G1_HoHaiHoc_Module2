package ss3_ArraysAndMethodsInJava.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement2DArray {
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

        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("\nSố lớn nhất trong ma trận là: " + max);

    }
}

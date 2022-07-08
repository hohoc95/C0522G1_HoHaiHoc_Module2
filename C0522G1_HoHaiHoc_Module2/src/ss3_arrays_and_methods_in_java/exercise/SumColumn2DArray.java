package ss3_arrays_and_methods_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumColumn2DArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng: ");
        int row = scanner.nextInt();

        System.out.print("Nhập số cột: ");
        int col = scanner.nextInt();

        int[][] array2d = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Nhập matrix[%d][%d]: ", i, j);
                array2d[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < array2d.length; i++){
            System.out.print(Arrays.toString(array2d[i]));
            System.out.println();
        }

        int indexCol;
        boolean isNotIndexCol;

        do {
            System.out.print("Nhập cột cần tính tổng: ");
            indexCol = scanner.nextInt();

            isNotIndexCol = indexCol < 0 || indexCol > col - 1;

            if (isNotIndexCol) {
                System.out.println("Nhập lại cột cần tính tổng. ");
            }
        } while (isNotIndexCol);

        int sum = 0;

//        for (double[] element : array2d) {
//            System.out.println(element[indexCol]);
//            sum += element[indexCol];
        for (int i = 0; i < array2d.length; i++){
            sum += array2d[i][indexCol];
        }
        System.out.printf("Tổng các phần tử trong cột %d là:%10.2f", indexCol, sum);
    }
}

package ss15_exception_and_debug.exercise.controller;

import ss15_exception_and_debug.exercise.exception.TriangleIllegalException;
import ss15_exception_and_debug.exercise.model.TriangleIllegal;

import java.util.Scanner;

public class TriangleController {
    public static void main(String[] args) {
        int firstEdge;
        int secondEdge;
        int thirdEdge;
        Scanner scanner = new Scanner(System.in);
        while (true){
            try{
                System.out.print("Nhập vào độ dài cạnh a: ");
                firstEdge = Integer.parseInt(scanner.nextLine());

                System.out.print("Nhập vào độ dài cạnh b: ");
                secondEdge = Integer.parseInt(scanner.nextLine());

                System.out.print("Nhập vào độ dài cạnh c: ");
                thirdEdge = Integer.parseInt(scanner.nextLine());

                TriangleIllegal triangleIllegal = new TriangleIllegal(firstEdge, secondEdge, thirdEdge);

                System.out.println(triangleIllegal);
                break;
            }
            catch (NumberFormatException e){
                System.out.println("Nhập sai kiểu dữ liệu!");
            }
            catch (TriangleIllegalException e){
                System.out.println("ffhghf");
            }
        }
    }
}

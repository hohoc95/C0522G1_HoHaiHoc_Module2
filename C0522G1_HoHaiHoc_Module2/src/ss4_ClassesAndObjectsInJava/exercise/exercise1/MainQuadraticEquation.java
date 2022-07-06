package ss4_ClassesAndObjectsInJava.exercise.exercise1;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");

        double numberA = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");

        double numberB = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double numberC = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(numberA, numberB, numberC);
        System.out.println(quadraticEquation.display());
        System.out.println(quadraticEquation.viewResult());
    }
}

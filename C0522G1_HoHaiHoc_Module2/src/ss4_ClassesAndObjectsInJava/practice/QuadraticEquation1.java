package ss4_ClassesAndObjectsInJava.practice;

import java.util.Scanner;

public class QuadraticEquation1 {
    double numberA, numberB, numberC;

    //Trường dữ liệu a, b, và c thuộc kiểu private double đại diện cho 3 hệ số.

    private QuadraticEquation1(double numberA, double numberB, double numberC) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.numberC = numberC;
    }
    //Phương thức getter cho a, b, c

    public double getNumberA() {
        return this.numberA;
    }

    public double getNumberB() {
        return this.numberB;
    }

    public double getNumberC() {
        return this.numberC;
    }

    public String display() {
        return "Phương trình bậc 2: " + getNumberA() + "*X^2 + " + getNumberB() + "*X + " + getNumberC() + " = 0";
    }

    //Trả về delta theo công thức delta = b2 - 4ac.
    public double getDelta() {
        return getNumberB() * getNumberB() - 4 * getNumberA() * getNumberC();
    }

    public double getRoot1() {
        return (- getNumberB() + Math.sqrt(getDelta())) / (2 * getNumberA());
    }

    public double getRoot2() {
        return (- getNumberB() - Math.sqrt(getDelta())) / (2 * getNumberA());
    }

    public String viewResult() {
        if (getDelta() < 0) {
            return "Phương trình vô nghiệm";
        }
        if (getDelta() == 0){
            return "Phương trình có nghiệm kép" + getRoot1();
        }
        return "Phương trình có 2 nghiêm, x1 = " + getRoot1() + " x2 " + getRoot1();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào hệ số a");
        double numberA = scanner.nextDouble();
        System.out.println("Nhập vào hệ số b");
        double numberB = scanner.nextDouble();
        System.out.println("Nhập vào hệ số c");
        double numberC = scanner.nextDouble();

        QuadraticEquation1 quadraticEquation1 = new QuadraticEquation1( numberA, numberB, numberC);
        System.out.println(quadraticEquation1.display());
        System.out.println(quadraticEquation1.viewResult());
    }

}

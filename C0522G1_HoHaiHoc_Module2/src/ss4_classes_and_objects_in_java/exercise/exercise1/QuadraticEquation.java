package ss4_classes_and_objects_in_java.exercise.exercise1;

public class QuadraticEquation {

    double numberA;
    double numberB;
    double numberC;

    //Trường dữ liệu a, b, và c thuộc kiểu private double đại diện cho 3 hệ số.

    QuadraticEquation(double numberA, double numberB, double numberC) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.numberC = numberC;
    }

    //Phương thức gettter cho a, b và c.

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
        return "Phương trình bậc 2: " + getNumberA() + "x^2 + " + getNumberB() + "x + " + getNumberC() + " = 0";
    }
    //Trả về delta theo công thức delta = b2 - 4ac.

    public double getDelta() {
        return getNumberB() * getNumberB() - 4 * getNumberA() * getNumberC();
    }

    //Phương thức getRoot1() và getRoot2() trả về 2 nghiệm của phương trình

    public double getRoot1() {
        return (- getNumberB() + Math.sqrt(getDelta())) / (2 * getNumberA());
    }

    public double getRoot2() {
        return (- getNumberB() - Math.sqrt(getDelta())) / (2 * getNumberA());
    }

    public String viewResult() {
        if (getDelta() < 0) {
            return "Phương trình vô nghiệm!";
        }

        if (getDelta() == 0) {
            return "Phương trình có nghiệm kép: x1 = x2 = " + getRoot1();
        }

        return "Phương trình có 2 nghiệm phân biệt: x1 = " + getRoot1() + " và x2 = " + getRoot2();
    }


}

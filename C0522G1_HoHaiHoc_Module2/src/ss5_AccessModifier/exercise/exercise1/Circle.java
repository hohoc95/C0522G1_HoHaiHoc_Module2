package ss5_AccessModifier.exercise.exercise1;

public class Circle {
    //Hai thuộc tính có access modifier là private: radius (double) có giá trị khởi tạo là 1.0,
    //                                              color (String) có giá trị khởi tạo là "red".
    private double radius = 1.0;
    private String color = "red";

    //Hai hàm tạo: một không có tham số và một có tham số là radius.


    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    //Hai phương thức có access modifier là public: getRadius và getArea.


    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return getRadius() * getRadius() * Math.PI;
    }
    public String toString(){
        return String.format("radius: %1.2f, color: %s, area: %1.2f",getRadius(),getColor(),getArea());
    }
}

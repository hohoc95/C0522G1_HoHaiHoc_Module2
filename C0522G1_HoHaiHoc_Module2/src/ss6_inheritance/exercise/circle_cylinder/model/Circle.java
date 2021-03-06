package ss6_inheritance.exercise.circle_cylinder.model;

public class Circle {
    private double radius = 1.0;
    private String color = "blue";

    public Circle(){
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return getRadius() * getRadius() * Math.PI;
    }
    public double getPerimeter(){
        return getArea() * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("color: %s, radius: %f, area: %f, perimeter: %f",getColor(), getRadius(),getArea(), getPerimeter());
    }
}

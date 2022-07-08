package ss6_inheritance.exercise.circle_cylinder.model;

public class Cylinder extends Circle{
    private double height = 2.0;

    public Cylinder(){
    }
    public Cylinder(double height){
        this.height = height;
    }
    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }
    @Override
    public double getArea(){
        return super.getArea() * 2 + super.getPerimeter() * height;
    }
    public double getVolume(){
        return super.getArea() * this.height;
    }
    public String toString(){
        return String.format("color: %s, radius: %f, area: %f, volume: %f",getColor(), getRadius(), getArea(), getVolume());
    }
}

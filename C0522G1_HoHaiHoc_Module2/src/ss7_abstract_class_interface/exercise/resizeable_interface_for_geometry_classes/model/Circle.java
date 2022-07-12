package ss7_abstract_class_interface.exercise.resizeable_interface_for_geometry_classes.model;

import ss7_abstract_class_interface.exercise.resizeable_interface_for_geometry_classes.service.Resizeable;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public double resize(double pencent) {
        setRadius(getRadius() + getRadius() * pencent/100);
        return getArea();
    }
}

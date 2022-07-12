package ss7_abstract_class_interface.exercise.resizeable_interface_for_geometry_classes.model;

import ss7_abstract_class_interface.exercise.resizeable_interface_for_geometry_classes.service.Resizeable;

public class Square extends Shape  {
    private double edge = 1.0;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea() {
        return getEdge() * getEdge();
    }

    public double getPerimeter() {
        return 4 * getEdge();
    }

    @Override
    public String toString() {
        return "A Square with edge="
                + getEdge()
                + "Area is" + getArea()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public double resize(double pencent) {
        setEdge( getEdge() + getEdge() * pencent /100);
        return getArea();
    }
}

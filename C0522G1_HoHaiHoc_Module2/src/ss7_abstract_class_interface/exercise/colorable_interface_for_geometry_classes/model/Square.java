package ss7_abstract_class_interface.exercise.colorable_interface_for_geometry_classes.model;

import ss7_abstract_class_interface.exercise.colorable_interface_for_geometry_classes.controller.Colorable;

public class Square extends Shape implements Colorable {

    private double edge = 1.0;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(String color, boolean filled) {
        super(color, filled);
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea() {
        return edge * edge;
    }

    @Override
    public String toString() {
        return "A Square with color of "
                + getColor()
                + " and "
                + " area is " + getArea()
                + (isFilled() ? "filled" : "not filled");
    }


    @Override
    public String howToColor() {
        return "Color all four sides.";
    }
}
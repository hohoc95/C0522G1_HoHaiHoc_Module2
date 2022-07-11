package ss7_abstract_class_interface.exercise.colorable_interface_for_geometry_classes.controller;

import ss7_abstract_class_interface.exercise.colorable_interface_for_geometry_classes.model.Shape;
import ss7_abstract_class_interface.exercise.colorable_interface_for_geometry_classes.model.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[1];
        shapes[0] = new Square();

        for (Shape shape : shapes) {
            System.out.println(shape);

            if (shape instanceof Square) {
                Shape shape1 = (Square) shape;
                System.out.println(shape1.howToColor());
            }
        }
    }

}

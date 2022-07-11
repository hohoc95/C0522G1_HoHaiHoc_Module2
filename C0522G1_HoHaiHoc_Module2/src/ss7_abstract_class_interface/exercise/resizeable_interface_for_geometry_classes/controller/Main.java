package ss7_abstract_class_interface.exercise.resizeable_interface_for_geometry_classes.controller;

import ss7_abstract_class_interface.exercise.resizeable_interface_for_geometry_classes.model.Circle;
import ss7_abstract_class_interface.exercise.resizeable_interface_for_geometry_classes.model.Rectangle;
import ss7_abstract_class_interface.exercise.resizeable_interface_for_geometry_classes.model.Shape;
import ss7_abstract_class_interface.exercise.resizeable_interface_for_geometry_classes.model.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();

        for (Shape shape : shapes){
            System.out.println("");

            if(shape instanceof Circle){
                Shape shape1 = (Circle) shape;
                System.out.println(shape1.resize(10));
            }
        }
    }
}

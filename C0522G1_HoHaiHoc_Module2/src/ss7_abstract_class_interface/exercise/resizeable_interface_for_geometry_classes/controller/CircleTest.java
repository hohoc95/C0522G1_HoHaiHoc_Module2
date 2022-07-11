package ss7_abstract_class_interface.exercise.resizeable_interface_for_geometry_classes.controller;

import ss7_abstract_class_interface.exercise.resizeable_interface_for_geometry_classes.model.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }
}

package ss7_abstract_class_interface.exercise.resizeable_interface_for_geometry_classes.controller;

import ss7_abstract_class_interface.exercise.resizeable_interface_for_geometry_classes.model.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
    }
}

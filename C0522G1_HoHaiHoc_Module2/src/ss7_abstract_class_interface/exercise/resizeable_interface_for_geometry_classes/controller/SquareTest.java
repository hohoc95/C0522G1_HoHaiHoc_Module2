package ss7_abstract_class_interface.exercise.resizeable_interface_for_geometry_classes.controller;

import ss7_abstract_class_interface.exercise.resizeable_interface_for_geometry_classes.model.Square;

public class SquareTest {
    public static void main(String[] args) {
        Square Square = new Square();
        System.out.println(Square);

        Square = new Square(2.0);
        System.out.println(Square);

        Square = new Square(5.0);
        System.out.println(Square);
    }
}

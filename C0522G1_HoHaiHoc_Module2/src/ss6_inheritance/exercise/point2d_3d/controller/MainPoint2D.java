package ss6_inheritance.exercise.point2d_3d.controller;

import ss6_inheritance.exercise.point2d_3d.model.Point2D;

import java.util.Arrays;

public class MainPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println("Array of {x,y} = " + Arrays.toString(point2D.getXY()));
        System.out.printf("(%s)", point2D);

        point2D = new Point2D(1, 2);
        System.out.println("\nArray of {x,y} = " + Arrays.toString(point2D.getXY()));
        System.out.printf("(%s)", point2D);

    }
}

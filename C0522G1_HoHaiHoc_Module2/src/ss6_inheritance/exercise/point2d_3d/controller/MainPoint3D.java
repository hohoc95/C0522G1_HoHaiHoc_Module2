package ss6_inheritance.exercise.point2d_3d.controller;

import ss6_inheritance.exercise.point2d_3d.model.Point3D;

import java.util.Arrays;

public class MainPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println("Array of {x,y,z} = " + Arrays.toString(point3D.getXYZ()));
        System.out.printf("(%s)", point3D);

        point3D = new Point3D(1,2,3);
        System.out.println("\nArray of {x,y,z} = " + Arrays.toString(point3D.getXYZ()));
        System.out.printf("(%s)", point3D);
    }
}

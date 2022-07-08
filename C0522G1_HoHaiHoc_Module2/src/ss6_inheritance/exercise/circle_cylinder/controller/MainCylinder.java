package ss6_inheritance.exercise.circle_cylinder.controller;

import ss6_inheritance.exercise.circle_cylinder.model.Cylinder;

public class MainCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        cylinder1.setColor("blue");
        cylinder1.setRadius(2.0);

        Cylinder cylinder2 = new Cylinder();
        cylinder2.setColor("blue");
        cylinder2.setRadius(2.0);

        System.out.println(cylinder1);
        System.out.println(cylinder2);
    }
}

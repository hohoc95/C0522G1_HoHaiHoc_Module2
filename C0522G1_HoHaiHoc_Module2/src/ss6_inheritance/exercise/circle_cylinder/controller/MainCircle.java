package ss6_inheritance.exercise.circle_cylinder.controller;

import ss6_inheritance.exercise.circle_cylinder.model.Circle;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setColor("blue");
        circle1.setRadius(2.0);

        Circle circle2 = new Circle();
        circle2.setColor("blue");
        circle2.setRadius(2.0);

        System.out.println(circle1);
        System.out.println(circle2);
    }
}

package ss6_inheritance.exercise.point_moveablePoint.controller;

import ss6_inheritance.exercise.point_moveablePoint.model.MoveablePoint;

public class MainMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(1,2);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}

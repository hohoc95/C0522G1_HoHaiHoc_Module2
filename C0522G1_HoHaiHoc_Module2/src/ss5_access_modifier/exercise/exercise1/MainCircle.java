package ss5_access_modifier.exercise.exercise1;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setRadius(3);
        circle1.setColor("blue");
        Circle circle2 = new Circle();
        circle2.setRadius(5);
        circle2.setColor("green");

        System.out.println(circle1);
        System.out.println(circle2);
    }
}

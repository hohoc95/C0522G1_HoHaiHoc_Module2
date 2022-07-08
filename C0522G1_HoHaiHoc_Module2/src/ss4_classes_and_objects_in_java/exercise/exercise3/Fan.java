package ss4_classes_and_objects_in_java.exercise.exercise3;

public class Fan {
    //3 hằng được đặt tên là SLOW, MEDIUM, và FAST với giá trị 1, 2, và 3 để biểu thị tốc độ quạt.
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    //Trường speed có kiểu số nguyên (private int) để xác định tốc độ quạt, mặc định là SLOW (speed = SLOW).
    private int speed = SLOW;

    //Trường on có kiểu private boolean để xác định quạt đang bật hay tắt, mặc định là false (tắt).
    private boolean on = false;

    //Trường radius có kiểu private double để xác định bán kính quạt, giá trị mặc định là 5
    private double radius = 5;

    //Trường color có kiểu dữ liệu private String để xác định màu quạt, mặc định là blue
    private String color = "blue";

    //Các getter và setter cho các thuộc tính
    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }

    public String toString() {
        if (isOn()) {
            return "speed: " + getSpeed() + ", color: " + getColor() + ", radius: " + getRadius() + ", fan is on!";
        }

        return "color: " + getColor() + ", radius: " + getRadius() + ", fan is off!";
    }
}

package ss6_inheritance.practice.model;

public class Circle extends GeometricObjects {

    //Có thêm thuộc tính radius (double).
    private double radius;

    //Có ba phương thức khởi tạo.
    //Phương thức khởi tạo mà không cần đối số đầu vào sẽ đặt giá trị mặc định cho radius là 1.0.
    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    //getter và setter cho phương thức.
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Có phương thức getArea và getPerimeter trả về diện tích và chu vi của hình.
    public double getArea(){
        return  getRadius() * getRadius() * Math.PI;
    }

    public double getPerimeter(){
        return  getArea() * 2 * Math.PI;
    }

    @Override
    public String toString(){
        return String.format("A Circle with radius = %s, which is a subclass of %1.2f", super.toString(), getRadius());
    }

}

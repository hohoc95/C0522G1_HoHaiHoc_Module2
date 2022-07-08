package ss6_inheritance.practice.model;

public class Rectangle extends GeometricObjects {
    //Có thêm hai thuộc tính là width và length (double).
    private double width = 1.0;
    private double length = 1.0;

    //Phương thức khởi tạo mà không cần đối số đầu vào sẽ đặt giá trị mặc định cho width và length là 1.0.
    public Rectangle(){
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    //Có các getter và setter cho tất cả các thuộc tính.

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //Có phương thức getArea và getPerimeter trả về diện tích và chu vi của hình.
    public double getArea(){
        return getWidth() * getLength();
    }
    public double getPerimeter(){
        return (getWidth() + getLength()) * 2 ;
    }

    public String toString(){
        return String.format("A Rectangle with width= %f and length= %f, which is a subclass of GeometricObjects",getWidth(), getLength());
    }
}
